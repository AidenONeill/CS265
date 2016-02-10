package Lab6;


public class DUtest {

	public	String OrderProcess(int quantity, Boolean credit_worthy,int	inventory )
	{
		String output;
		if	((quantity <=1000) && (credit_worthy))
			if	(quantity <=inventory)
				output=	"Accept order";
			else
				output=	"Defer order";
		else
			output ="Reject order";
		return	output;
	}

}