import java.io.*;
class perfact
{
	public static void main(String args[])
	{
		int sum=0;
		int i=1;
		int j=6;
		while(i<j)
		{
			if(j%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
			System.out.println(sum);
	}
}