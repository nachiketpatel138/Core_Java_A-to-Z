import java.io.*;
class b
{
	public static void main(String[] arg)
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("eneter the value"));
		
			if(value>=10000)
			{
				System.out.println("25% discount");
				int dis=value*25/100;
				System.out.println("dis"+dis);
			}
			else
			{
				System.out.println("no discount");
			}
		
		
	}
}