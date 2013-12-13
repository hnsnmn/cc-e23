package authorizer;

public class AcceptingAuthorizerStub implements Authorizer {
	@Override
	public UserID authorize(String username, String password) {
		return new UserID(1);
	}
}
