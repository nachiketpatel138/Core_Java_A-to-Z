import java.io.*;
class A
{
	public void show(String s)
	{
		System.out.println("A...."+s);
	}
}
class B extends A
{
	B()
	{
		show("Is");
	}
}
class C
{
	C()
	{
		A a=new A();
		a.show("Has");
	}
}
class IsHas
{
	public static void main(String[] args)
	{
		B b=new B();
		C c=new C();
	}
}