import java.io.*;
class c
{
	public static int test()
	{
		Console con=System.console();
			int p=Integer.parseInt(con.readLine("amount is "));
			int r=Integer.parseInt(con.readLine("rate is   "));
			int n=Integer.parseInt(con.readLine("time is   "));
		int i=p*r*n/100;
		return i;
}
public static void main(String[] args)
{
	int returnValue=test();
	System.out.println("returnValue  ="+returnValue);
}
}