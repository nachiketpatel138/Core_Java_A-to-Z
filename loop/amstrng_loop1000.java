import java.io.*;
class amstrong
{
	public static void main(String args[])
	{
		//	Console con=System.console();
		//	int value=Integer.parseInt(con.readLine("enter the value"));
		int i=1;
		int value=1;
		int	temp;
		
		while(i<=1000)
		{
			int  sum=0;
			//	int tempvalue=value;
			value=i;
			while(value>0)
			{	
			  		temp=value%10;
					value/=10;
					sum+=temp*temp*temp;
			}
					if(sum==i)
					{
						System.out.println(i);
					}
					i++;
		}	
		
	}
}

