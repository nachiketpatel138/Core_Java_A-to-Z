import java.io.*;
class a
{
	public void show()
	{
		System.out.println("A...");
	}
}
class b extends a
{
	public void show()
	{
		System.out.println("B...");
	}
}
class c extends a
{
	public void show()
	{
		System.out.println("C...");
	}
}
class d extends a
{
}
class runtimepolymorphism
{
	public static void main(String[] args)
	{
		b b=new b();
		c c=new c();
		a ao[]=new a[4];
		ao[0]=new a();
		ao[1]=b;
		ao[2]=c;
		ao[3]=new d();
		
		for(int i=0;i<ao.length;i++)
		ao[i].show();
		
	}
}