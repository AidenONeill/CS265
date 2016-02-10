package Lab6;
import static org.junit.Assert.*;

import org.junit.Test;

public class DUtestTestMulti {

	@Test
	public void testOrderProcess1() {
		DUtest d = new DUtest();
		
		String rv = d.OrderProcess(999, true, 1000);
		assertEquals(rv,"Accept order");
	}
	@Test
	public void testOrderProcess2() {
		DUtest d = new DUtest();
		
		String rv = d.OrderProcess(900,false, 1000);
		assertEquals(rv,"Reject order");
	}
	@Test
	public void testOrderProcess3() {
		DUtest d = new DUtest();
		
		String rv = d.OrderProcess(2000, false, 1000);
		assertEquals(rv,"Reject order");
	}
	@Test
	public void testOrderProcess4() {
		DUtest d = new DUtest();
		
		String rv = d.OrderProcess(500, true, 200);
		assertEquals(rv,"Defer order");
	}

}
