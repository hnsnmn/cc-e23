package usecases;

import authorizer.UserID;
import entities.User;

public interface UserGateway {
	User getUser(UserID id);
}
