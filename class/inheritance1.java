import java.io.*;
class superclass
{
	public void supermethod()
	{
		System.out.println("super-----");
	}
}
class subclass extends superclass
{
	public void submethod()
	{
		System.out.println("sub-----");
	}
}
class single_inheritance
{
	public static void main(String[] args)
	{
		subclass subobj=new subclass();
		subobj.submethod();
		subobj.supermethod();
	}
}