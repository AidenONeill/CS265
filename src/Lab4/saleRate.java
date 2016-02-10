package Lab4;

public class saleRate {
	public double saleRate(int quantity, boolean cashpayment, boolean wholesale)
	{
		double discount=0.00;
		if (quantity <50)
			
			if (cashpayment && wholesale)
				discount=0.04;
			else
			{
				if (cashpayment ||wholesale)
					discount=0.02;
			}
		else
		{
			discount=0.04;
			if (cashpayment ||wholesale)
				discount=discount+0.02;
		}
		return discount;
	}


}
