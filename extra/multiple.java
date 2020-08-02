import java.io.*;
class multple
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		
		int f=value/10;
		int l=value%10-1;
		int sum=f;
		
		while(l>0)
		{
			sum*=f;	
			l--;
				
		}
		System.out.println(sum);
	}
}