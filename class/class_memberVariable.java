import java.io.*;
class student
{
	private int id;
	private String name;
	private static int nos;
	public student()
	{
		id++;
		name="DC";
		nos++;
	}
	public student(int i,String name)
	{
		id++;
		this.name=name;
		nos++;
	}
	public student(student s)
	{
		id++;
		this.name=s.name;
		nos++;
	}
	public void show()
	{
		System.out.println("ID ="+id);
		System.out.println("NaME ="+name);
		System.out.println("Number of Students ="+nos);
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