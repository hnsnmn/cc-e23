package usecases;

import authorizer.Authorizer;
import authorizer.UserID;

public abstract class AuthorizerSpy implements Authorizer {
	private String username;
	private String password;

	@Override
	public UserID authorize(String username, String password) {
		this.username = username;
		this.password = password;
		return makeUser();
	}

	protected abstract UserID makeUser();

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
