import java.io.*;
class swap
{
	public static void main(String[] args )
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int a[]=new int[value];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(con.readLine("enter the value ["+i+"] "));
		}
			
			int ip=Integer.parseInt(con.readLine("enter the index  "));	
			for(int i=0,t=ip;i<a.length;i++,ip++)
			{
				if(i<a.length-t)
					a[i]=a[ip];
				else
					a[i]=0;
				
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println("value ["+i+"] "+a[i]);
			}
			
	}
}