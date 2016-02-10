package Lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingAccountTest {

	@Test
	public void testDiscountRate() {
		SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(30);
		assertEquals(rv,0.03,0.0001);
		}
	@Test
	public void testDiscountRate2(){
       SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(152);
		assertEquals(rv,0.05,0.0001);
		
	}
	@Test
	public void testDiscountRate3(){
       SavingAccount sa = new SavingAccount();
		
		double rv = sa.DiscountRate(1245);
		assertEquals(rv,0.07,0.0001);
		
	}
	@Test
	public void testDiscountRate4(){
	       SavingAccount sa = new SavingAccount();
			
			double rv = sa.DiscountRate(0);
			assertEquals(rv,0.00,0.0001);
			
		}
	
	}


