import java.io.*;
class strong
{
	public static void main(String args[])
	{
		
		int t=1;
		while(t<=1000)
		{
		int value=t;
		int temp;
		int sum=0;
				while(value>0)
				{
					
					int i=1;
					int fact=1;
					temp=value%10;
					
								while(i<=temp)
								{
									 fact=fact*i;
									  i++;
								}
					sum=fact+sum;
					value=value/10;
					
				}
					if(t==sum)
					{
						System.out.println(sum);
					}
		t++;
		}
	}
}
