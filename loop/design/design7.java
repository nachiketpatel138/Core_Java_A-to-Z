import java.io.*;
class design
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int i=1;
		int j=1;
		while(i<=value)
		{
			
			
			int k=1;
			while(k<=i)
			{
				System.out.print(j++);
		    	k++;	
			}
			
			i++;
			System.out.println();
			
		}
	}
}