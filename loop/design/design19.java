import java.io.*;
class design
{
	public static void main(String[] args)
	{
		int n=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			for(int l=n;l<=16;l++)
			{
				if(l%2==0)
				{
				System.out.print(" ");
				}
			}
			n=++n +3;
			for(int k=i;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}