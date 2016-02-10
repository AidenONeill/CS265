package Lab4;
import static org.junit.Assert.*;

import org.junit.Test;



public class saleRateTest {

	@Test
	public void testSaleRate() {
		saleRate sa = new saleRate();
		
		double rv = sa.saleRate(50,true,true);
		assertEquals(rv,0.06,0.0001);
	}
	@Test
	public void testSaleRate2() {
		saleRate sa = new saleRate();
		
		double rv = sa.saleRate(45,true,true);
		assertEquals(rv,0.04,0.0001);
	}
	@Test
	public void testSaleRate3() {
		saleRate sa = new saleRate();
		
		double rv = sa.saleRate(45,true,false);
		assertEquals(rv,0.02,0.0001);
	}
	@Test
	public void testSaleRate4() {
		saleRate sa = new saleRate();
		
		double rv = sa.saleRate(45,false,false);
		assertEquals(rv,0.00,0.0001);
	}
	

}
