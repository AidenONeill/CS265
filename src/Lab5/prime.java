package Lab5;

public class prime {
	public String Totalprime(int[]numbers, int	value)
	{	
		String result;
		int sum =0;
		boolean isPrime;
		int	k;
		for( int i=0; i<= numbers.length-1; i++)
		{
			k=2;
			isPrime=true;
			while((isPrime) &&  (k <= numbers[i]/2))
			{
				if((numbers[i] % k)==0)
					isPrime=false;
				k=k+1;
			}
			if(isPrime)
			{
				sum=sum+numbers[i];
				System.out.println(numbers[i]);
			}
		}
		if(sum==0)
			result="No prime in the list";
		else if(sum>  value)
				result ="Sum of prime>value";
		else if	(sum==value)
				result ="Sum of prime=value";
				
			else
				result="Sum of prime<value";
		return
				result;
	}
}





