import java.io.*;
class design
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		
		int i=1;
		while(i<=value)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j++);	
			}
		    i++;
			System.out.println();
	
		}	
				
	}
}