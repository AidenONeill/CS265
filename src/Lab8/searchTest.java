package Lab8;
import static org.junit.Assert.*;

import org.junit.Test;

public class searchTest {

	@Test
	public void testBinarySearch() {
		int ar[] = {3,5,6,7,8,11,12};
		search s = new search();		
		boolean rv = s.binarySearch(5,ar);
		assertTrue(rv);
	}
	@Test
	public void testBinarySearch2() {
		int ar[] = {3,5,6,7,8,11,12};
		search s = new search();		
		boolean rv = s.binarySearch(4,ar);
		assertFalse(rv);
	}	

}
