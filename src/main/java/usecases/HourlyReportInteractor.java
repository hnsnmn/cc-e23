package usecases;

import java.util.Date;

public class HourlyReportInteractor {
	public void generateReport(Date reportDate, Session session) {
		if(!isValidReportDate(reportDate))
			throw new InvalidDate();
		// ...
	}

	private boolean isValidReportDate(Date reportDate) {
		if(reportDate == null)
			return false;
		return true;
	}

	public class InvalidDate extends RuntimeException {
	}
}
