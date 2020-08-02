import java.io.*;
class reorder
{
	public static void main(String[] args)
	{
		Console con=System.console();
	//	int min_co_day=Integer.parseInt(con.readLine());
		int max_co_day=Integer.parseInt(con.readLine());
		int reorder=Integer.parseInt(con.readLine());
		int reorder_level=max_co_day*reorder;
		System.out.println("reorder_level"+reorder_level);
		
	}
}