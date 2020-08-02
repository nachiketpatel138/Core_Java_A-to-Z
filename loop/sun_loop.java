import java.io.*;
class sum
{
	public static void main(String args[])
	{
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the number"));
		int sum=0;
			while(value>0)
			{
				
				int temp=value/10;
				
				sum+=temp;
				
				value=value%10;
				if(temp!=0)
					System.out.print(temp+"+");
				else
					System.out.print(temp+"=");
				
			}
			System.out.println(sum);
	}
}