import java.io.*;
class A
{
	A()
	{
		System.out.println("Super constructor");
	}
	static
	{
		System.out.println("super static initializationblock");
	}
	{
		System.out.println("super initializationBlock");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Sub constructor");
	}
	static
	{
		System.out.println("sub static initializationblock");
	}
	{
		System.out.println("sub initializationBlock");
	}
}

class intializationblock
{
	public static void main(String[] args)
	{
		B b=new B();
	}
}
