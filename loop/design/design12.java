import java.io.*;
class design
{
	public static void main(String args[])
	{
		int i=1;
		while(i<=4)
		{
			
			int k=5-i;
			while(1<=k)
			{
				k--;
				System.out.print(" ");
				
			}
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
	}
}