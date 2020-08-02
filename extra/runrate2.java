import java.io.*;
class run
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int run=Integer.parseInt(con.readLine("eneter the run"));
		int over=Integer.parseInt(con.readLine("eneter the over"));
		run(run,over);
	}
	
    	public static void run(int r,int o)
    	{
		int runrate=run/over;
		System.out.println("runrate"+runrate);
        }
}
}