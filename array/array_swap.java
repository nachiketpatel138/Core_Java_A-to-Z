import java.io.*;
class swap
{
	public static void main(String[] args )
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int a[]=new int[value];
		int b[]=new int[value];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(con.readLine("enter the value ["+i+"] "));
		}
			
			int ip=Integer.parseInt(con.readLine("enter the index  "));	
			for(int i=0;ip<a.length;i++,ip++)
			{
				b[i]=a[ip];
			}
			for(int i=0;i<b.length;i++)
			{
				System.out.println("value ["+i+"] "+b[i]);
			}
			
	}
}