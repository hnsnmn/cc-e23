package entities;

import java.util.Calendar;

public class User {
	private Calendar time;
	private String name;
	private int loginCount;

	public String getName() {
		return this.name;
	}

	public Calendar getLastLoginTime() {
		return this.time;
	}

	public Integer getLoginCount() {
		return this.loginCount;
	}
}
