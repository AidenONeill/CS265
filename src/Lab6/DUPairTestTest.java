package Lab6;
import static org.junit.Assert.*;

import org.junit.Test;

public class DUPairTestTest {

	@Test
	public void testSequentialSearch() {
		
		int numbers[] = {4,5,6,7};
		
		DUPairTest d = new DUPairTest();
		boolean rv = d.sequentialSearch(numbers,6);
		assertTrue(rv);
	}

}
