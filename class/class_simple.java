import java.io.*;
class Student
{
	private int id;
	private String name;
	public void setValue(int i,String n)
	{
		id=i;
		name=n;
	}
	public void show()
	{
		System.out.print("ID :"+id);
		System.out.println("  NAME :"+name);
	}
}
class appuse
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setValue(101,"abc");
		s1.show();
		
		Student s2=new Student();
		s1.setValue(102,"xyz");
		s1.show();
	}
}