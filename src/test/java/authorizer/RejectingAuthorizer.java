package authorizer;

public class RejectingAuthorizer implements Authorizer {
	@Override
	public UserID authorize(String username, String password) {
		return new InvalidUserID();
	}
}
