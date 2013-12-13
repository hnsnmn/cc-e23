package usecases;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class HourlyReportInteractorTest {
	private HourlyReportInteractor interactor;

	@Before
	public void setUp() {
		interactor = new HourlyReportInteractor();
	}

	@Test(expected = HourlyReportInteractor.InvalidDate.class)
	public void testInvalidDate() {
		Date reportDate = null;
		Session session = new DummySession();
		interactor.generateReport(reportDate, session);
	}
}
