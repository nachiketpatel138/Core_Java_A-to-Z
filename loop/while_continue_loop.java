import java.io.*;
class breaak
{
	public static void main(String args[])
	{
			int i=0;
			while(i<3)
			{
				System.out.println("\ti="+i);
				if(i%2==1)
			    continue;
			    i++;
			}
			System.out.println("bye");
	}					
}