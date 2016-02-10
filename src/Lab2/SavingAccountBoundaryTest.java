package Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingAccountBoundaryTest {

	@Test
	public void testDiscountRate1() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(1);
		assertEquals(rv,0.03,0.0001);
		}
	@Test
	public void testDiscountRate2() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(100);
		assertEquals(rv,0.03,0.0001);
		}
	@Test
	public void testDiscountRate3() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(101);
		assertEquals(rv,0.05,0.0001);
		}
	@Test
	public void testDiscountRate4() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(1000);
		assertEquals(rv,0.05,0.0001);
		}
	@Test
	public void testDiscountRate5() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(1001);
		assertEquals(rv,0.07,0.0001);
		}
	@Test
	public void testDiscountRate6() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(Integer.MAX_VALUE);
		assertEquals(rv,0.07,0.0001);
		}
	@Test
	public void testDiscountRate7() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(0);
		assertEquals(rv,0.00,0.0001);
		}

}
