import java.io.*;
final  class A
{
	final int no=10;
	A()
	{
		System.out.println("A...");
		no=20;
	}
	final public void show()
	{
		System.out.println("A....");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B...");
	}
	public void show()
	{
		System.out.println("B...");
	}
}
class Finalkeyword
{
	public static void main(String[] args)
	{
		B b=new B();
	}
}