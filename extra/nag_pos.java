import java.io.*;
class b
{
	public static void main(String[] arg)
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("eneter the value"));
		{
			if(value>0)
			{
				System.out.println("positive");
			}
			else
			{
				System.out.println("nagative");
			}
		}
	}
}