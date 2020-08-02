import java.io.*;
class design
{
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
		{
			for(int k=1;k<5-i;k++)
			{
			System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
			for(int l=4,i=1;	l>=1	;l--,i++)
			{
				for(int n=i;n>0;n--)
				{
					System.out.print(" ");
				}
				
				for(int o=l;o>0;o--)
				{
					System.out.print("*");
				}	
				System.out.println();
				
			}
	}
			
}
	
