import java.io.*;
class amstrong
{
	public static void main(String args[])
	{
	//	Console con=System.console();
		int value=152;
		int tempvalue=value;
		int  sum=0;
		int	temp;
	//	int i=1;
	
		while(value>0)
		{	
		  		temp=value%10;
				value/=10;
				sum+=temp*temp*temp;
			
		}
		System.out.println(sum);
			
			if(sum==tempvalue)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}

