import java.io.*;
class pre
{
	public static void main(String[] args)
	
	{
		int a=2;
		int b=++a;
		int c=b++;
		int d=--c;
		 a=a--;
		int e=a*b+c/d;
			     System.out.println("a"+a);
			     System.out.println("b"+b);
			     System.out.println("c"+c);
			     System.out.println("d"+d);
			     System.out.println("e"+e);
	}
}