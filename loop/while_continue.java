import java.io.*;
class breaak
{
	public static void main(String args[])
	{
			int i=0;
			while(i<3)
			{
				if(i%2==1)
			    continue;
			    System.out.println("\ti="+i);
			    i++;
			}
			System.out.println("bye");
	}					
}