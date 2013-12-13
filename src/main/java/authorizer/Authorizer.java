package authorizer;

public interface Authorizer {
	UserID authorize(String username, String password);
}
