package usecases;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import entities.UserStub;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(HierarchicalContextRunner.class)
public class LoginInteractorTest {
	private LoginInteractorImpl interactor;
	private AuthorizerSpy authorizer;
	private UserGateway gateway;
	private LoginPresenterSpy presenterSpy;

	@Before
	public void setupInteractor() {
		interactor = new LoginInteractorImpl();
		presenterSpy = new LoginPresenterSpy();
		interactor.setPresenter(presenterSpy);
	}

	public class ValidLoginTests {
		@Before
		public void setupValidLogin() {
			authorizer = new AcceptingAuthorizerSpy();
			gateway = new UserGatewayStub();
			interactor.setAuthorizer(authorizer);
			interactor.setUserGateway(gateway);
		}

		@Test
		public void normalLogin() {
			LoginRequest request = new LoginRequest();
			request.username = "username";
			request.password = "password";

			interactor.login(request);

			assertThat(authorizer.getUsername(), is("username"));
			assertThat(authorizer.getPassword(), is("password"));

			LoginResponse response = presenterSpy.getInvokedResponse();
			assertThat(response.name, is(UserStub.STUB_NAME));
			assertThat(response.lastLoginTime, is(UserStub.STUB_TIME));
			assertThat(response.loginCount, is(UserStub.STUB_LOGIN_COUNT));
		}
	}
}
