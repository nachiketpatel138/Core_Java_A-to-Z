import java.io.*;
class power
{
	public static void main(String[] args)
	{
		
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value "));
		int	a[]=new int[value];
		int	ac[]=new int[value];
		int p[]=new int[value];
		for(int i=0;i<value;i++)
		{
			a[i]=Integer.parseInt(con.readLine("enter the value:"));
			ac[i]=a[i];
		}
		
		
		for(int i=0,pv=0,pn=1;i<value;i++)
		{
			int max=ac[0];
			pv=0;
			for(int j=0;j<value;j++)
			{
				if(ac[j]>max)
				{
					max=ac[j];
					pv=j;
				}
			}
			p[pv]=pn++;
			ac[pv]=0;
		}
	
		
		
		
		for(int j=0;j<value;j++)
		{
			System.out.println(a[j]+" "+p[j]);
		}
		
	}
}