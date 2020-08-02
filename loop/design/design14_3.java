import java.io.*;
class design
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=5-i;s>0;s--)
			{
				System.out.print(" ");
			}
			
			for(int p=i;p>0;p--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int s=i;s>0;s--)
			{
				System.out.print(" ");
			}
			
			for(int p=5-i;p>0;p--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
			
}
	
