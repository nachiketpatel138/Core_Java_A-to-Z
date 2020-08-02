import java.io.*;
class a
{
	public static void test()
	{
			Console con=System.console();
			int p=Integer.parseInt(con.readLine("amount is "));
			int r=Integer.parseInt(con.readLine("rate is   "));
			int n=Integer.parseInt(con.readLine("time is   "));
		
	int	i=p*r*n/100;
			System.out.println("i  "+i);
	}
	
	public static void main(String[] args)
	{
		test();
		
		System.out.println("main");
	}
			
}