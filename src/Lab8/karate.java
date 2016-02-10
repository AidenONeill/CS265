package Lab8;

public class karate {

	public	double	CalculateFee(int age,int memberyear)
	{
		int fee=0;
		if	((age<6) || (age>65) || (memberyear< 0)	|| (memberyear>59))
			
			System.	out	.println("Not valid input");
		
		else if(memberyear<=3)
			fee=300;
		else 
			fee=270;
		return	fee;
	}

}
