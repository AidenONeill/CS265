package Lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class LabAssignBTest {

	@Test
	public void testOrderScreening() {
		LabAssignB l = new LabAssignB();
		
		String rv = l.OrderScreening(999, true, 1000);
		assertEquals(rv,"Accept order");
	}
	@Test
	public void testOrderScreening2() {
		LabAssignB l = new LabAssignB();
		
		String rv = l.OrderScreening(1001, false, 1000);
		assertEquals(rv,"Reject order");
	}	
	@Test
	public void testOrderScreening3() {
		LabAssignB l = new LabAssignB();
		
		String rv = l.OrderScreening(900, true, 1000);
		assertEquals(rv,"Accept order");
	}	
	@Test
	public void testOrderScreening4() {
		LabAssignB l = new LabAssignB();
		
		String rv = l.OrderScreening(940, true, 500);
		assertEquals(rv,"Defer order");
		
					
		}
	}		

