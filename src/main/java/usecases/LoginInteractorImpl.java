package usecases;

import authorizer.Authorizer;
import authorizer.UserID;
import entities.User;

public class LoginInteractorImpl implements LoginInteractor {
	private Authorizer authorizer;
	private UserGateway userGateway;
	private LoginPresenter presenter;

	public void setAuthorizer(Authorizer authorizer) {
		this.authorizer = authorizer;
	}

	public void setUserGateway(UserGateway userGateway) {
		this.userGateway = userGateway;
	}

	public void setPresenter(LoginPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void login(LoginRequest request) {
		UserID userID = authorizer.authorize(request.username, request.password);
		User user = userGateway.getUser(userID);
		LoginResponse response = new LoginResponse();
		response.name = user.getName();
		response.lastLoginTime = user.getLastLoginTime();
		response.loginCount = user.getLoginCount();
		presenter.presentResponse(response);
	}
}
