import java.io.*;
class design
{
	public static void main(String args[])
	{
		char ch='A';
		char c='A';
		while(ch<='D')
		{
			char cr='A';
			while(cr<=ch)
			{
				System.out.print(c++);
				cr++;
			}
			ch++;
			System.out.println();
		}
		
		
	}
}