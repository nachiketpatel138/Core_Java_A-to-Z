import java.io.*;
class strong
{
	public static void main(String args[])
	{
		int value=145;
		int tempvalue=value;
		int temp;
		int sum=0;
	//	int fact=1;
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
		System.out.println(sum);
		if(tempvalue==sum)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
	}
}