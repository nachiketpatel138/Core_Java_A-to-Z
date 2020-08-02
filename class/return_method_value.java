import java.io.*;
class breaak
{
	public static void main(String args[])
	{
			int a=50;
			int i=test(a);
			System.out.println("bye" +i);
	}
	public static int test(int i)
	{
			System.out.println("test in");
			if(i==5)
				return 5;
			System.out.println("test out");
				return i+i;
	}
}