package Lab9;

public class Vending {

	boolean	vendingmachine	(int itemcode,int quantity,int money)
	{
		double	topay;
		double	softdrink = 2;
		double	snack = 2.5;
		double	change;
		boolean	activate;
		if	((itemcode<1) || (itemcode > 10) || (quantity<=0) || (money <=0))
			activate = 	false;
		else
		{
			if	(itemcode<=5)
				topay = softdrink*quantity;
			else
				topay =snack*quantity;
			
			if	(topay<= money)
			{
				activate = 	true;
				change = (money-topay);
				System.	out	.println("need change "	+ change);
			}
			else
			{
				activate = 	false	;
				System.	out	.println("Not enough money");
			}
		}
		return	activate;
	}

}
