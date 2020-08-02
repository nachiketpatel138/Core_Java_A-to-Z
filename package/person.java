package office.a.b.c;
public class person
{
	private String name;
	private String surname;
	public	person(String n,String s)
	{
		name=n;
		surname=s;
	}
	public void show()
	{
		System.out.println("name ="+name);
		System.out.println("surname ="+surname);
		System.out.println();
	}
}