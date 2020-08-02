package school;
import school .employee.faculties;
public class school extends 
{
	private String name;
	private String address;
	public school(String n,String a)
	{
		name=n;
		address=a;
	}
	public void show()
	{
		super.show();
		System.out.println("name ="+name);
		System.out.println("address"+address);
		System.out.println();
	}
}