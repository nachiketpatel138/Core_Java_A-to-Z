class A
{
	public static void B()
	{
	}
	public static void C()
	{	
	}
	public static void same()
	{
		System.out.println("same ... A");
	}
}
class X extends A
{
	public static void Y()
	{
	}
	public static void Z()
	{	
	}
	public static void same()
	{
		System.out.println("same ... X");
	}
}
class main
{
	public static void main(String[] args)
	{
		A a=new A();
		a.B();
		a.C();
		a.Y();
		a.Z();
		a.same();
	}
}