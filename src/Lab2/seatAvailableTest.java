package Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class seatAvailableTest {

	
	@Test
	public void test1() {	
	boolean rv = Booking.seatsAvailable(50,75);
	assertFalse(rv);
	}
	
	@Test
	public void test2() {
	boolean rv = Booking.seatsAvailable(50,25);
	assertTrue(rv);
	}
	

	

	}


