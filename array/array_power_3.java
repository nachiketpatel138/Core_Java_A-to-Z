import java.io.*;
class power
{
	public static void main(String[] args)
	{	
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value "));
		int	a[]=new int[value];
		int b[]=new int[value];
		int c[]=new int[value];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(con.readLine("enter the value  1   "));
		}
		for(int i=0; i<b.length;i++)
		{
			b[i]=Integer.parseInt(con.readLine("enter the value 2    "));
		}
		for(int i=0;i<c.length;i++)
		{
			c[i]=1;
			for(int j=0;j<b[i];j++)
			{
				c[i]*=a[i];
			}
			System.out.println(c[i]);
		}
	}
}