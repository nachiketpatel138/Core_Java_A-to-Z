import java.io.*;
class loop
{
	public static void main(String args[])
	{
		int i=1;
		while(i<3)
		{
			System.out.println("i");
			int j=0;
			while(j<3)
			{
				System.out.println("j");
				j++;
			}
			i++;
		}
	}
}