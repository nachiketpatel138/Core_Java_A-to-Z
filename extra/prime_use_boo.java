import java.io.*;
class prime
{
	public static void main(String args[])
	{
		//Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		boolean boo=true;
	int	i=2;
		while(i<value)
		{
			if(value%i==0)
			{
				boo=false;
					break;
			}
			i++;
		}
			if(boo)
				System.out.println("prime");
			else	
				System.out.println("not prime");
		}
	}
