import java.io.*;
class breaak
{
	public static void main(String args[])
	{
		
	main:	for(int i=1;i<=2;i++)
		    {
			System.out.println("i="+i);
			int j=1;
	nested: 	while(j<3)
			{
				System.out.println("\tj="+j);
				if(j==2)
			    break main;
			    j++;
			}
			
		}			
		System.out.println("bye");
	}
	
}