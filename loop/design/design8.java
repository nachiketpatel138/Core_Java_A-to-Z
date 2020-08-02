import java.io.*;
class design
{
	public static void main(String args[])
	{
		int i=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)
			{
				if(k%2==0)
				{
					System.out.print("#");	
				}
				else
				{
					System.out.print("*");
				}
				
		    	k++;	
			}
			System.out.println();
			i++;
			
			
			
		}
	}
		
}









