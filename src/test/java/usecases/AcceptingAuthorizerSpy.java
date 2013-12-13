package usecases;

import authorizer.UserID;

public class AcceptingAuthorizerSpy extends AuthorizerSpy {
	protected UserID makeUser() {
		return new UserID(1);
	}
}
