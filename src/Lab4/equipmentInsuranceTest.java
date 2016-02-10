package Lab4;
import static org.junit.Assert.*;

import org.junit.Test;



public class equipmentInsuranceTest {

	@Test
	public void testEquipmentInsurance() 
	{
		equipmentInsurance equiq = new equipmentInsurance();
		
		int rv = equiq.equipmentInsurance(true,true);
		assertEquals(rv,20,0.0001);
			
	}
	@Test
	public void testEquipmentInsurance2() 
	{
		equipmentInsurance equiq = new equipmentInsurance();
		
		int rv = equiq.equipmentInsurance(true,false);
		assertEquals(rv,10,0.0001);
			
	}
	@Test
	public void testEquipmentInsurance3() 
	{
		equipmentInsurance equiq = new equipmentInsurance();
		
		int rv = equiq.equipmentInsurance(false,false);
		assertEquals(rv,5,0.0001);
			
	}


}
