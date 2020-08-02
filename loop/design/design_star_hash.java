import java.io.*;
class design
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=4;i++)
		{
			for(int k=5-i;1<=k;k--)
			{
				System.out.print(" ");	
			}
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}	
					for(int k=1;k<=3;k++)
					{
							for(int l=1;l<=k;l++)
							{
								System.out.print("#");
							//	System.out.println();
							}
		
					}
			System.out.println();
		}
		
	}
}