import java.io.*;
class factorial
{
	public static void main(String args[])
	{
		Console con=System.console();
		int i=1;
		int fact=1;
		int value=Integer.parseInt(con.readLine("enter the value"));
		while(i<=value)
		{
			 fact=fact*i;
			i++;	
		}
		System.out.println(fact);
	}
}