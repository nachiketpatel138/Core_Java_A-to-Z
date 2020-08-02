import java.io.*;
class power
{
	public static void main(String[] args)
	{
		int max=1;
		int top=-1;
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value "));
		int	a[]=new int[value];
		int b[]=new int[value];
		for(int i=0;i<value;i++)
		{
			a[++top]=Integer.parseInt(con.readLine("enter the value:"));
		}
		for(int i=0;i<value;i++)
		{
			int j=i+1;
			while(j<value)
			{
				if(a[i]<a[j])
				{
					b[j]=a[j];
				}
					j++;
			}
			
			
		}
		for(int j=0;j<value;j++)
		{
		System.out.println(b[j]);
		}
		
	}
}