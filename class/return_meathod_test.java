import java.io.*;
class breaak
{
	public static void main(String args[])
	{
			int i=1;
			test(i);
			System.out.println("bye");
	}
	public static void test(int a)
	{
		System.out.println("test in");
		if(a==5)
			return;
			System.out.println("test out");
	}					
}