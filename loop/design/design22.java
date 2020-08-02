import java.io.*;
class design
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			} 
			for(int j=1;j<(i*2);j++)
       		{
            System.out.print(j);
			}
			System.out.println();
		}
		int k=4;
		for(int l=1;l<5;l++) 
		{
			for(int o=l;o>=0;o--)
			{
				System.out.print(" ");
			}
			for(int y=1;y<(k*2);y++)
			{
				System.out.print(y);
			}
			k--;
			System.out.println();	
		}
	}
}
