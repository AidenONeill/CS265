package Lab1;

public class Triangle {

	public boolean isEquilateral(int s1, int s2, int s3)
	{
		if ((s1==s2) && (s1==s3))
			return true;
		else
			return false;
	}
	public boolean Isisosceles (int s1, int s2, int s3)
	{

		if ((s1==s2) || (s1==s3) ||(s2==s3))
			return true;
		else
			return false;
	}
	public boolean Isrightangled (int s1, int s2, int s3)
	{

		if ((s1*s1 +s2*s2 ==s3*s3 )||(s2*s2 +s3*s3 ==s1*s1 )||(s1*s1 + s3*s3 == s2*s2 ))
			return true;
		else
			return false;
	}

}



