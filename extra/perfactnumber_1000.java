import java.io.*;
class perfact
{
	public static void main(String args[])
	{
		int t=2;
		while(t<1000)
		{
		
			int sum=0;
			int i=1;
			int j=t;
			while(i<j)
			{
				if(j%i==0)
				{
					sum=sum+i;
				}
				i++;
			}
			
			if(sum==t)
				System.out.println("Sum "+sum);
				//System.out.println("T "+t);
				t++;
		}		
	}
}