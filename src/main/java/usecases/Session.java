package usecases;

import authorizer.UserID;

import java.util.Date;

public interface Session {
	Authorizations getAuthorizations();
	UserID getLoggedInUser();
	Date getLoginTime();
	PayrollContext getPayrollContext();
}
