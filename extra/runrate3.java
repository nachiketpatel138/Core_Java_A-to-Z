import java.io.*;
class run
{
		public static int run()
    	{
		Console con=System.console();
		int run=Integer.parseInt(con.readLine("eneter the run"));
		int over=Integer.parseInt(con.readLine("eneter the over"));
		int runrate=run/over;
		return runrate;
        }

	    public static void main(String[] args)
	{
		int returnValue = run();
		System.out.println("returnValue "+returnValue);
	}
	
    
}