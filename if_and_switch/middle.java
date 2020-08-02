import java.io.*;
class middle
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int a=Integer.parseInt(con.readLine("enter the value"));
	   	int b=Integer.parseInt(con.readLine("enter the value"));
	   	int c=Integer.parseInt(con.readLine("enter the value"));
	   	
	   	if(a>b)
	   	{
	   		if(a>c)
	   		{
	   			if(b>c)
	   			{
	   				System.out.println("b");
	   			}
	   			else
	   			{
	   				System.out.println("c");
	   			}
	   			
	   		}
	   		else
	   		{
	   			System.out.println("a");
	   		}
	   	}
	   	else
	   	{
	   		if(b>c)
	   		{
	   			if(a>c)
	   			{
	   				System.out.println("a");
	   			}
	   			else
	   			{
	   				System.out.println("c");
	   			}
	   		}
	   		else
	   		{
	   			System.out.println("b");
	   		}
	   	}
	}
}
.
