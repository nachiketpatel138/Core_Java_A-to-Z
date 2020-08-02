package office.a;
import office.a.b.contect_info;
public class employee extends contect_info
{
	private int salary;
	public employee(String n,String s,int p,int sa)
	{
		super(n,s,p);
		salary=sa;
	}
	public void show()
	{
		super.show();
		System.out.println("salaru ="+salary);
		System.out.println();
	}
}