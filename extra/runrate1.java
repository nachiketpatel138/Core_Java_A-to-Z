import java.io.*;
class run
{
	public static void run()
		{
			Console con=System.console();
		int run=Integer.parseInt(con.readLine("enter the run"));
		int over=Integer.parseInt(con.readLine("enter the over"));
			int runrate;
			runrate=run/over;
			System.out.println("runrate  ="+runrate);+
		}

public static void main(String[] args)
{
	run();
}
}
