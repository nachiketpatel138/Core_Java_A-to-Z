import java.io.*;
class a
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int value =Integer.parseInt(con.readLine("eneter the mark"));
		if(value>=90)
		{
			System.out.println("E");
		}
		else if (value>=75)
		{
					System.out.println("S");
		}
		else if (value>=59)
		{
			System.out.println("A");
		}
		else if (value>=49)
		{
			System.out.println("B");
		}
		else if (value>=39)
		{
			System.out.println("C");
		}
		else if(value>=0)
		{
			System.out.println("F");
		}
		}
	}

