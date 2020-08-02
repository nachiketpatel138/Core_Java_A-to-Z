import java.io.*;
class power
{
	public static void main(String[] args)
	{
		
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value "));
		int	a[]=new int[value];
		int b[]=new int[value];
		int t[]=new int[value];
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(con.readLine("enter the value 1 "));	
		}
		
			for(int i=0;i<b.length;i++)
			{
				b[i]=Integer.parseInt(con.readLine("enter the value 2"));
			}
		
		for(int i=0;i<a.length;i++)
		{
		 	t[i]=a[i];
		}
		for(int i=0; i<a.length;i++)
		{
			a[i]=b[i];		
		}
		for (int i=0;i<t.length;i++)
		{
			b[i]=t[i];
		}
		for(int i=0;i<value;i++)
		{
			System.out.println(a[i]);	
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}