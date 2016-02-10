package Lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerTest {

	@Test
	public void testCheckContainer1() 
	{
		Container a = new Container();
		boolean yflag = a.checkContainer('h',-1,-1);
		assertTrue(yflag);
			
	}
	@Test
	public void testCheckContainer2() 
	{
		Container a = new Container();
		boolean yflag = a.checkContainer('S',950,1);
		assertTrue(yflag);
			
	}	
	@Test
	public void testCheckContainer3() 
	{
		Container a = new Container();
		boolean yflag = a.checkContainer('L',9000,19);
		assertTrue(yflag);
			
	}	
	@Test
	public void testCheckContainer4() 
	{
		Container a = new Container();
		boolean yflag = a.checkContainer('M',4532,7);
		assertTrue(yflag);
			
	}	

}
