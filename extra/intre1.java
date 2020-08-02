import java.io.*;
class intr
{
	public static void main(String[] args)
	{
		Console con=System.console();
			int p=Integer.parseInt(con.readLine("amount is "));
			int r=Integer.parseInt(con.readLine("rate is   "));
			int n=Integer.parseInt(con.readLine("time is   "));
		test(p,r,n);
	}
			public static void test(int p,int r,int n)
		{
			int i=p*r*n/100;
			System.out.println("i"+i);
		}
	}
