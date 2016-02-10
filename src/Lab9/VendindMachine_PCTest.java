package Lab9;
import static org.junit.Assert.*;

import org.junit.Test;

public class VendindMachine_PCTest {

	@Test
	public void testVendingmachine1() {
		Vending v = new Vending();
		boolean rv = v.vendingmachine(11,1,2);
		assertFalse(rv);
				
	}
	@Test
	public void testVendingmachine2() {
		Vending v = new Vending();
		boolean rv = v.vendingmachine(7,1,3);
		assertTrue(rv);
				
	}
	@Test
	public void testVendingmachine3() {
		Vending v = new Vending();
		boolean rv = v.vendingmachine(3,1,1);
		assertFalse(rv);
				
	}
	@Test
	public void testVendingmachine4() {
		Vending v = new Vending();
		boolean rv = v.vendingmachine(7,1,2);
		assertFalse(rv);
				
	}
	@Test
	public void testVendingmachine5() {
		Vending v = new Vending();
		boolean rv = v.vendingmachine(3,1,2);
		assertTrue(rv);
				
	}


}





