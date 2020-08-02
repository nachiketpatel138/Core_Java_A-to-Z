import java.io.*;
class breaak
{
	public static void main(String args[])
	{
		
	main:	for(int i=1;i<=3;i++)
		    {
			System.out.println("i="+i);
			int j=1;
	nested: do
			{
				j++;
				//System.out.println("\tj="+j);
				if(j==2)
			    continue main;
			    System.out.println("\twhile"+j);
			    
			}
			while(j<=3);	
		}			
		System.out.println("bye");
	}
	
}