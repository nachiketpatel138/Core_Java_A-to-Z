import java.io.*;
class do_while
{
	public static void main(String aargs[])
	{
		
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the value"));
		int i=1;
		do
		{			
		System.out.println(value*i++);
		}while(i<=10);
	}
}