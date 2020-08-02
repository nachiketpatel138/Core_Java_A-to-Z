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
}
class d extends a
{
	public void md()
	{
		System.out.println("child 3");
		
	}
	
}
class use
{
	public static void main(String [] args)
	{
		
		c ob=new c(); 
		d o=new d();
			ob.ma();
			ob.mb();
			ob.mc();
			
			o.ma();
			o.md();
	}
}

	

