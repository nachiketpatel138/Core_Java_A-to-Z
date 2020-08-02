import java.io.*;
class student
{
	private int Rollno;
	private String name;
	
	public student(int r,String n)
	{
		Rollno=r;
		name=n;
	}
	public student()
	{
		
	}
	public void setRollno(int i)
	{
		Rollno=i;
	}
	public int getRollno()
	{
		return Rollno;
	}
	
	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
	
}