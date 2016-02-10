package Lab6;

public class DUPairTest {

	public	boolean	sequentialSearch(int[]numbers,int key)
	{
		boolean	found=	false;
		int	i=0;
		int	index=-1;
		while	((!found) && (i<=numbers.length-1))
		{
			if(numbers[i]==key)
			{ 
				found=true;
				index=i;
			}
			    i=i+1;
		}
		if(found)
			System.	out.println("The value is at the position "+ index);
		return	found;
	}

}
