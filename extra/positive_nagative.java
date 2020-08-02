import java.io.*;
class pv
{
	public static void main(String[] args)
	
	{
		
		if(pn())
			System.out.println("positive");
		else
			System.out.println("negative");
				
			
	}
		public static boolean pn()
		{
			int value=99;
			if(value>0)
				return true;
				else
				return false;
		}
}