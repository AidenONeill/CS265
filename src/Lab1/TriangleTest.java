package Lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testIsEquilateral1() {
		
		Triangle t=new Triangle();
		boolean result= t.isEquilateral(2,2,2);
		assertTrue(result);
		
	}
	@Test
	public void testIsEquilateral2() {
		
		Triangle t=new Triangle();
		boolean result= t.isEquilateral(2,1,2);
		assertFalse(result);
		
	}
	@Test
	public void testIsisosceles1() {
		
		Triangle t=new Triangle();
		boolean result= t.Isisosceles(2,1,2);
		assertTrue(result);
		
	}
	@Test
	public void testIsisosceles2() {
		
		Triangle t=new Triangle();
		boolean result= t.Isisosceles(3,1,2);
		assertFalse(result);
		
	}
	@Test
	public void testIsrightangled1() {
		
		Triangle t=new Triangle();
		boolean result= t.Isrightangled(3,4,5);
		assertTrue(result);
		
	}
	@Test
	public void testIsrightangled() {
		
		Triangle t=new Triangle();
		boolean result= t.Isrightangled(2,5,2);
		assertFalse(result);
		
	}

}
