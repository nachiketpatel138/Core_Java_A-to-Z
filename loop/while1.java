import java .io.*;
class ab
{
	public static void main(String args[])
	{
	
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the table number"));
		int i=value*10;
		int temp=0;
		while(temp<i)	
		{
			temp+=value;		
			System.out.println(temp);
		}
	}
}