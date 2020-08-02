import java.io.*;
class A
{
	public A()
	{
		System.out.println("constor");
	}
	public void A()
	{
		System.out.println("method");
	}
}
class constractor
{
	public static void main(String[] args)
	{
		A a=new A();
		a.A();
	}
}