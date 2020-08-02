import java.io.*;
class Student
{
	private int id;
	private String name;
	
	Student(int i,String n)
	{
		id=i;
		name=n;
	}
	public String toString()
	{
		return "ID "+id+" NAME "+name; 
	}
}
class objectToString
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"ABC");
		String sobj="String"+s1;
		System.out.println(s1);
		System.out.println(sobj);
	}
}