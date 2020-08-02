import java.io.*;
class Student
{
	private int id;
	private String name;
	
	public void setID(int i)
	{
		id=i;
	}
	public int getID()
	{
		return id;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
}
class appuse
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		
		System.out.println("ID "+s1.getID());
		System.out.println("Name "+s1.getName());
		
		s1.setID(101);
		s1.setName("abc");
		
		System.out.println("ID "+s1.getID());
		System.out.println("Name "+s1.getName());
		System.out.println();
		mobile m1=new mobile();
		mobile m2=new mobile();
		m1.setmname("mi");
		m1.setprice(10000);
		m2.setmname("sony");
		m1.setprice(12000);
		System.out.println("mname  ="+m1.getmname());
		System.out.println("price ="+m1.getprice());
		System.out.println();
		car c1=new car();
		c1.setcname("swift");
		c1.setprice(5000000);
		c1.setaverage(24);
		System.out.println("carname ="+c1.getcname());
		System.out.println("price ="+c1.getprice());
		System.out.println("average ="+c1.getaverage());
	}
}
class mobile
{
	private String mname;
	private int price;
	public void setmname(String s)
	{
		mname=s;
	}
	public String getmname()
	{
		return mname;
	}
	public void setprice(int i)
	{
		price=i;
	}
	public int getprice()
	{
		return price;
	}
}
class car
{
	private String cname;
	private int price;
	private int average;
	public void setcname(String s)
	{
		cname=s;
	}
	public String getcname()
	{
		return cname;
	}
		public void setprice(int i)
	{
		price=i;
	}
	public int getprice()
	{
		return price;
	}
		public void setaverage(int a)
	{
		average=a;
	}
	public int getaverage()
	{
		return average;
	}
}