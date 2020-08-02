import java.io.*;
class a
{
	public void ma()
	{
		System.out.println("child");
	}
}
class b extends a
{
	public void mb()
	{
		System.out.println("child 1");
	}
}
class c extends b
{
	public void mc()
	{
		System.out.println("child 2");
	}
	public static void main(String [] args)
	{
		c obj=new c();
		obj.ma();
		obj.mb();
		obj.mc();
	}
}
