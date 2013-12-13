package usecases;

import authorizer.UserID;

import java.util.Date;

public class DummySession implements Session {
	@Override
	public Authorizations getAuthorizations() {
		return null;
	}

	@Override
	public UserID getLoggedInUser() {
		return null;
	}

	@Override
	public Date getLoginTime() {
		return null;
	}

	@Override
	public PayrollContext getPayrollContext() {
		return null;
	}
}
