import java.io.*;
class run
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int run=Integer.parseInt(con.readLine("eneter the run"));
		int over=Integer.parseInt(con.readLine("eneter the over"));
	 	int returnValue = run( run,over);
	 		System.out.println("returnValue"+returnValue);
	}
	
    	public static int run(int run,int over)
    	{
		int runrate=run/over;
		return runrate;
        }
}
