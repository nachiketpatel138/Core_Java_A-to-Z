import java.io.*;
class exceptionH
{
	public static void main(String args[])
	{
		int a=10,b=0;
		try
		{
		System.out.println("before");
		System.out.println(a/b);
		System.out.println("after");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("ArithmeticException msg");
		}
		System.out.println("out");
	}
}