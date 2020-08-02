import java.io.*;
class superclass
{
	private int id;
	public void setID(int id)
	{
		this.id=id;
	}
	public void getID()
	{
		System.out.println("id :"+id);
	}
}
class subclass extends superclass
{
	private String name;
	public void setname(String name)
	{
		this.name=name;
	}
	public void getname()
	{
		System.out.println("name :"+name);
		
	}
}
class singleinheritance
{
	public static void main(String[] args)
	{
		subclass subobj=new subclass();
		subobj.setID(100);
		subobj.setname("nachiket");
		subobj.getID();
		subobj.getname();
	}
}