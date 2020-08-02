import java.io.*;
class sum
{
	public static void main(String args[])
	{
		Console con=System.console();
		int i=1;
		int sum=0;
		while(i<=10)
		{
			Integer value=Integer.parseInt(con.readLine("enter the value "+i++ +"   "));
			sum+=value;
		}		
			
		System.out.println("Sum "+sum);
		
	}
}