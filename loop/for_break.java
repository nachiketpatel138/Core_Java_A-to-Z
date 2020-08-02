import java.io.*;
class breaak
{
	public static void main(String args[])
	{
		
		for(int i=1;  ;i++)
		{
			System.out.println("i="+i);
			if(i==5)
			break;
		}			
		System.out.println("bye");                     //infinite loop is terminated by the break
	}
	
}