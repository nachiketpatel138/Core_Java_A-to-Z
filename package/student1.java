package school .employee.students;
public class student1 extends faculties
{
	private String name;
	private String address;
	public student1(String n,String a)
	{
		name=n;
		address=a;
	}
	public student1()
	{
	}
	public void show()
	{
		System.out.println("name ="+name);
		System.out.println("address ="+address);
		System.out.println();
	}
}