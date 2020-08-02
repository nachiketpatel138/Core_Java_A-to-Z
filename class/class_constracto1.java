import java.io.*;
class student
{
	private int id;
	private String name;
	public student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public student(student s)
	{
		this(s.id,s.name);
	}
}
class anotherconstructor
{
	public static void main(String[] args)
	{
	//	student student1=new student();
		student student2=new student(101,"pc");
		student student3=new student(student2);
	}
}