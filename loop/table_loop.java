import java.io.*;
class table
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int i=1;
		
		while(i<=10)
		{
			int j=0;
			while(j<value)
			{
				j++;
				int	table=i*j;
				System.out.print( "\t"+table );
			}	
				i++;
				System.out.println();
		}
		
	}
}