import java.io.*;
class breaak
{
	public static void main(String args[])
	{
			for(int i=1;i<=10;i++)
			{
				System.out.println("i="+i);
				if(i==5)
					return;
			}
			System.out.println("bye");
	}					
}