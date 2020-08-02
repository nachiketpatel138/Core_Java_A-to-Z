import java.io.*;
class student
{
	private int id;
	private String name;
	public student()
	{
		id=10;
		name="DC";
	}
	public student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public student(student s)
	{
		this.id=s.id;
		this.name=s.name;
	}
	public void show()
	{
		System.out.println("ID ="+id);
		System.out.println("NaME ="+name);
		System.out.println();
	}
}
class constructor
{
	public static void main(String[]args)
	{
		student student1=new student();
		student student2=new student(101,"JAVA");
		student student3=new student(student2);
		student1.show();
		
		System.out.println("parameterizd");
		student2.show();
		System.out.println("copy");
		student3.show();
		
		System.out.println("copy reference");
		student student4=student3;
		student4.show();
	}
}