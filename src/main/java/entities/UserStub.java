package entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UserStub extends User {
	public static final Calendar STUB_TIME =
			new GregorianCalendar(2013, 11, 13, 10, 31);
	public static final String STUB_NAME = "mike stub";
	public static final int STUB_LOGIN_COUNT = 99;

	@Override
	public Calendar getLastLoginTime() {
		return STUB_TIME;
	}

	@Override
	public String getName() {
		return STUB_NAME;
	}

	@Override
	public Integer getLoginCount() {
		return STUB_LOGIN_COUNT;
	}
}
