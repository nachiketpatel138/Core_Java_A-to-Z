import java.io.*;
class day
{
	public static void main(String arg[])
	{
		Console con=System.console();
		int day=Integer.parseInt(con.readLine("enter the day"));
		int hr;
		hr=day*24;
		System.out.println(hr);
	}
}