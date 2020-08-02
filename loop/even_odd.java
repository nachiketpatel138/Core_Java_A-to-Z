import java.io.*;
class even_odd
{
	public static void main(String args[])
	{
    	
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the number"));
		int i=0;
		while(i<value)
		{
	         if(i%2==0)
	         {
				 System.out.println(i+" is even");
	         }
			else
			{
				System.out.println(i+ " is odd");
			}
			i++;
		}

		
	}
}