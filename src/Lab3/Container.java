package Lab3;

public class Container {
	public boolean checkContainer(char size, int weight, int volume)
	{
		boolean ok = true;
		if ((weight<=0)||(volume<=0))
			ok=false;
		else if ((size=='S') && ((weight>1000)||(volume>1)))
			ok=false;
		else if ((size=='M') && ((weight>5000)||(volume>10)))
			ok=false;
		else if ((size=='L') && ((weight>10000) || (volume>20)))
			ok=false;
		return ok;
	}
}