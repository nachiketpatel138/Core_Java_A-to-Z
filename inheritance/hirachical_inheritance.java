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
class c extends a
{
	public void mc()
	{
		System.out.println("child 2");
	}		
}
class d 
{
	
	public static void main(String [] args)
	{
		
		b objb=new b();
		c objc=new c(); 
		
			objb.ma();
			objb.mb();
			
			objc.ma();
			objc.mc();
			
	}
}

	

