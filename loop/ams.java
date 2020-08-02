import java.io.*;
class am
{
	public static void main(String[] args)
	{
    	int	value=407;
    	int temValue=value;
		int l,m,f;
		if(value<10)
		{
			System.out.println("value is not amstrong");
		}
		else if(value<99)
		{
			System.out.println("value is not amstrong");
		}
		else if(value<999)
		{
			l=temValue%10;
			temValue/=10;
			m=temValue%10;
			temValue/=10;
			f=temValue%10;
			
			f=f*f*f;
			m=m*m*m;
			l=l*l*l;
			int sum=f+m+l;
			if(sum==value)
				System.out.println("yes");
			else
				System.out.println("no");
			
			
		}
	}
}