import java.io.*;
class Super
{
	int id;
	public void setID(int id)
	{
		this.id=id;
	}
	public void showID()
	{
		System.out.println("super id"+id);
	}
}
class sub extends Super
{
	private int id;
	public void setID(int a,int b)              //method overloding
	{
		super.id=a;
		this.id=b;
	}
	public void showID()					//  method overriding
	{
		super.showID();
		System.out.println("sub ID"+id);
	}//return type same otherwise error
}
class hide_super_class_member
{
	public static void main(String[] args)
	{
		sub subobj=new sub();
		subobj.showID();
		subobj.setID(8,9);
		subobj.showID();
	}
}