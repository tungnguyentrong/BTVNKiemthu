import static org.junit.Assert.*;

import org.junit.Test;


public class nextDayTest {

	@Test
	public void thang3() {
	nextDay date = new nextDay();
	String testDay = date.nextday(12, 3, 2012);
	assertEquals("13 - 3 - 2012", testDay);
	}
	@Test
	public void thang2() {
	nextDay date = new nextDay();
	String testDay = date.nextday(28, 2, 2012);
	assertEquals("29 - 02 - 2012", testDay);
	}
	@Test
	public void Error() {
	nextDay date = new nextDay();
	String testDay = date.nextday(-3, 17, 2014);
	assertEquals("Ko phu hop", testDay);
	}
}
