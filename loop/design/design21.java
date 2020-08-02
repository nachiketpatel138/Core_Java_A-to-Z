import java.io.*;
class design
{
	public static void main(String[] args)
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("  ");
			} 
			for(int j=1;j<(i*2);j++)
       		{
       		
            System.out.print(" "+ k*k);
            k++;
			}
			System.out.println();
		} 
	}
}
