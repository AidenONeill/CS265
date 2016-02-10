package Lab8;

public class search {

	public	boolean	binarySearch(int key, int[]elemArray) 
	{
		boolean	found=	false;	
		int	bottom=0;
		int	top=elemArray.length-1;
		int	mid;
		while((bottom<=top) && (found!=true))
		{
			mid=(top+bottom)/2;
			if(elemArray[mid]==key)
				found=true;
			else
			{
				if(elemArray[mid]<key)
					bottom=mid+1;
				else
					top=mid-1;
			}
		}
		return	found;
	}

}
