package Lab2;

public class SavingAccount {
	public double DiscountRate(int deposit)
	{
	double rv;
	if (deposit<=0)
	rv=0;
	else if (deposit<=100)
	rv =0.03;
	else if (deposit<=1000)
	rv=0.05;
	else
	rv =0.07; 
	return rv;
	} 

}
