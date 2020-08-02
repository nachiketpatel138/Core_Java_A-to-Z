import java.io.*;
class breaak
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("i="+i);
			int j=1;
			while(j<3)
			{
				System.out.println("\tj="+j);
				if(i==2)
			    break;
			    j++;
			}
			
		}			
		System.out.println("bye");
	}
	
}