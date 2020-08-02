import java.io.*;
class InvalidMarkException extends Exception
{
	InvalidMarkException(String msg)
	{
		super(msg);
	}
}
class UserDefineException
{
	static void dispgreade(int marks)throws InvalidMarkException
	{
		if(marks<0 || marks>100)
			throw new InvalidMarkException("marks should be in the range 0 to 100");
			if(marks>=75)System.out.println("s");
			else if(marks>=60)System.out.println("a");
			else if(marks>=50)System.out.println("b");
			else if(marks>=33)System.out.println("c");
			else System.out.println("f");
	}
	public static void main(String[] args)
	{
		Console con=System.console();
		try
		{
			int marks=Integer.parseInt(con.readLine("enter the marks"));
			dispgreade(marks);
		}
		catch(InvalidMarkException e)
		{
			System.out.println(e);
		}
	}
}
