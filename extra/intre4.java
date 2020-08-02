import java.io.*;
class d
{
	public static void main(String[] args)
	{
		Console con=System.console();
			int p=Integer.parseInt(con.readLine("amount is "));
			int r=Integer.parseInt(con.readLine("rate is   "));
			int n=Integer.parseInt(con.readLine("time is   "));
     	 	int returnValue =test(p,r,n);
	 		System.out.println("returnValue"+returnValue);
	}
	public static int test(int p,int r,int n)
	{
	   int	i=p*r*n/100;
		return i;
	}
}