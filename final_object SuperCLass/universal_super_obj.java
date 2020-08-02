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
}
class objectToString
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"NAME");
		String sobj="String"+s1;
		System.out.println(s1);
		System.out.println(sobj);
	}
}