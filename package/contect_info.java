package office.a.b;
import office.a.b.c.person;
public class contect_info extends person
{
	private int phone;
	public contect_info(String n,String s,int p)
	{
		super(n,s);
		phone=p;
	}
	public void show()
	{
		super.show();
		System.out.println("phone ="+phone);
		System.out.println();
	}
}