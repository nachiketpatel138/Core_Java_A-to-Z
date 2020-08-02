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
	public static void print()
	{
	//	System.out.println("ID ="+id);
	//	System.out.println("NaME ="+name);
		System.out.println("Number of Students ="+nos);
		System.out.println();
	}
}
class constructor
{
	public static void main(String[]args)
	{
		
		student student2=new student(101,"JAVA");
		
		//student2.show();
		
		// call static method 
		
		// type 1
		
		student2.print();
		
		// type 2
		
		student.print();
			
	}
}