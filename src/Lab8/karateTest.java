package Lab8;
import static org.junit.Assert.*;

import org.junit.Test;

public class karateTest {

	@Test
	public void testCalculateFee() 
	{
		karate k = new karate();
		double rv = k.CalculateFee(5,2);
		assertEquals(rv,0,0.00001);
	}
	@Test
	public void testCalculateFee1() 
	{
		karate k = new karate();
		double rv = k.CalculateFee(69,5);
		assertEquals(rv,0,0.00001);
	}
	@Test
	public void testCalculateFee2() 
	{
		karate k = new karate();
		double rv = k.CalculateFee(34,-1);
		assertEquals(rv,0,0.00001);
	}
	@Test
	public void testCalculateFee3() 
	{
		karate k = new karate();
		double rv = k.CalculateFee(34,123);
		assertEquals(rv,0,0.00001);
	}
	@Test
	public void testCalculateFee4() 
	{
		karate k = new karate();
		double rv = k.CalculateFee(34,2);
		assertEquals(rv,300,0.00001);
	}
	@Test
	public void testCalculateFee5() 
	{
		karate k = new karate();
		double rv = k.CalculateFee(34,5);
		assertEquals(rv,270,0.00001);
	}

}
