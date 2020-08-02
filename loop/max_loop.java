import java.io.*;
class max
{
	public static void main(String args[])
	{
		Console con=System.console();
		int i=1;
		int large=0;
		int valu=Integer.parseInt(con.readLine("enter the insert value"));
	    
		while(i<=valu)
		{
			
			
			int number;
			int value=Integer.parseInt(con.readLine("enter the number "));
		   if(value>large)
		   {
			   large=value ;
		   	}       
			i++;
		}
		System.out.println(large);
		
		
	}
}