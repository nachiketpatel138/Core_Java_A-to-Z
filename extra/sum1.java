import java.io.*;
class a
{
	public static void main(String[] arg)
	{	
			sum();
			sum(12);
			sum(12,10);
	}
	public static void sum()
	{
			int a=10,b=20;
			int c=a+b;
			System.out.println("c"+c);
	}
	public static void sum(int a)
	{
			int b=10;
			int c=a+b;
			System.out.println("c"+c);
	}
	public static void sum(int a,int b)
	{
			int c=a+b;
			System.out.println("c"+c);
	}
}