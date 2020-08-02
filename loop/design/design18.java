import java.io.*;
class design
{
	public static void main(String[] args)
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=5;j>i+1;j--)
			{
				System.out.print(j);
			}
			for(int k=i;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=i;l>0;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}
}