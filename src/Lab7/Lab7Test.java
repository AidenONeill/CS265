package Lab7;
import static org.junit.Assert.*;

import org.junit.Test;

public class Lab7Test 

{

	@Test
	public void testDiscount1() 
	{
		Lab7 d = new Lab7();
		double rv = d.discount(0);
		assertEquals(rv,0,0.0001);
	}
	@Test
	public void testDiscount2() 
	{
		Lab7 d = new Lab7();
		double rv = d.discount(1);
		assertEquals(rv,0,0.0001);
	}	
	@Test
	public void testDiscount3() 
	{
		Lab7 d = new Lab7();
		double rv = d.discount(51);
		assertEquals(rv,0.05,.0001);
	}
	@Test
	public void testDiscount4() 
	{
		Lab7 d = new Lab7();
		double rv = d.discount(201);
		assertEquals(rv,0.1,0.0001);
	}
	@Test
	public void testDiscount5() 
	{
		Lab7 d = new Lab7();
		double rv = d.discount(501);
		assertEquals(rv,0.14,0.0001);
	}

}
