import java.io.*;
class A
{
	A()
	{
		System.out.println("A....");
	}
	A(int i)
	{
		System.out.println("A...int");
	}
}
class B extends A
{
	B()
	{
		super(1);
		System.out.println("B....");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C....");
	}
}
class D extends C
{
	D()
	{
		System.out.println("D....");
	}
}
class constuctorinvocaton
{
	public static void main(String[] args)
	{
		D d=new D();
	}
}
