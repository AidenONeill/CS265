package Lab5;

import static org.junit.Assert.*;



import org.junit.Test;

public class primeTest {

	@Test
	public void testTotalprime() {
	  prime p = new prime();
	  int numbers [] = {6,4,8,12,10};

		String rv = p.Totalprime(numbers,2);
		assertEquals(rv,"No prime in the list");	
		}
	@Test
	public void testTotalprime2() {
	  prime p = new prime();
	  int numbers [] = {7,11,10,5};

		String rv = p.Totalprime(numbers,1);
		assertEquals(rv,"Sum of prime>value");	
		}
	@Test
	public void testTotalprime3() {
	  prime p = new prime();
	  int numbers [] = {6,4,8,12,3};

		String rv = p.Totalprime(numbers,3);
		assertEquals(rv,"Sum of prime=value");	
		}	
	@Test
	public void testTotalprime4() {
	  prime p = new prime();
	  int numbers [] = {7,11,10,5};

		String rv = p.Totalprime(numbers,25);
		assertEquals(rv,"Sum of prime<value");	
		}	
	}

