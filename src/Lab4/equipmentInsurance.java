package Lab4;

public class equipmentInsurance {
	
	public int equipmentInsurance(boolean sportsEquipment, boolean musicEquipment)
	{
		int insurance;
		if (sportsEquipment && musicEquipment)
			insurance = 20;
		else
			if (sportsEquipment || musicEquipment)
				insurance = 10;
			else
				insurance =5;
		return insurance;
	}

}
