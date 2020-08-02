import java.io.*;
class runrate
{
	public static void main(String[] args)
	{
		Console con = System.console();
		
			int over=Integer.parseInt (con.readLine("enter the over"));
			System.out.println("over"+over);
			int run=Integer.parseInt(con.readLine());
				System.out.println("run"+run);
		int runrate;
				runrate=run/over;
			System.out.println("runrate"+runrate);
			
	}
}