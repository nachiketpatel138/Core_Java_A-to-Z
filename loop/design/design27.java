import java.io.*;
class design
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int n=Integer.parseInt(con.readLine("Enter the value"));
		for(int j=n;j>0;j--)
		{
		for(int i=1;i<=j;i++)
		{
			System.out.print(i);
		}
		for(int k=1;k<n;k++)
		{
			System.out.println(" ");
		}
		System.out.println();
		}
	}
}