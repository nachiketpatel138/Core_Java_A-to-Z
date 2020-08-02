import java.io.*;
class d
{
	public static void main(String[] arg)
	{
		int a=10,b=40;

	int returnValue = test(b,a);
	System.out.println("returnValue ="+returnValue);
	}
	public static int test(int x,int y)
	{
	//	int a=10,b=20;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		int c=x+y+x;
		c=x*3;
		return c;
		
	}

}