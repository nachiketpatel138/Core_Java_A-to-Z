import java.io.*;
class sum
{
	public static void main(String args[])
	{
		Console con=System.console();
		int sum=0;
		System.out.println("Exit neg value input ");
		while(true)
		{
			Integer value=Integer.parseInt(con.readLine("enter the value "   ));
			if(value<0)
				break;
			sum+=value;
		}		
			
		System.out.println("value "+sum);
		
	}
}