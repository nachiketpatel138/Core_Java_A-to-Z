import java.io.*;
class a
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the vlaue"));
		int tax=0;
		
			
			if(value<=250000)
			{
				System.out.println("no tax");
			}
			else if(value<=400000)
			{
				tax=(value-250000)*10/100;
				
			}
			else if(value<=500000)
			{
				tax=(value-400000)*20/100+0+15000;
				
			}
			else if(value>=500000)
			{
				tax=(value-500000)*30/100+0+15000+20000;
				
			}
			
			System.out.println("Tax=  "+tax);
	}
	
}