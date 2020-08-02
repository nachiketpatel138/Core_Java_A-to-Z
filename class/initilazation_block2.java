import java.io.*;
class id
{
	private int id;
	private String name;
	private static int nos;

	static{
		Console con=System.console();
	//	System.out.print("enter id");
	//	id=Integer.parseInt(con.readLine());
	//	System.out.print("enter the namw");
	//	name=con.readLine();
		nos++;
	}

	public void show()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("nos "+nos);
	}
}
class initializationblock
{
	public static void main(String[] args)
	{
		id ibo=new id();
		id ibo2=new id();
		System.out.println("object 1(ibo)");
		ibo.show();
		System.out.println("object 2(ibo2)");
		ibo2.show();
	}
}