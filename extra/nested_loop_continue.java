import java.io.*;
class breaak
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("i="+i);
			int j=1;
			while(j<=3)
			{
				j++;
				if(i==2)
			    continue;
			    System.out.println("\tj="+i);
			}
			
		}			
		System.out.println("bye");
	}
	
}