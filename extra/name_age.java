import java.io.*;
class nameage
{
	public static void main(String args[])
	{
		Console con=System.console();
		System.out.print("enter name ");
		String name=con.readLine();
		
		int age=Integer.parseInt(con.readLine("Enter age"));
		System.out.println("hi "+name);
		System.out.println("your age "+age);
		
		System.out.println("hi "+name+"  your age "+age);
		
	}
}