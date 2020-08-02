import java.io.*;
class factorial
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int n1=0,n2=1,n3;
		while(n1<=value)
		{
		 	n3=n1+n2;
			n2=n1;
			n1=n3;
			System.out.print(" "+n2);
		}
	}
}	