import java.io.*;
class stringinput
{
	public static void main(String args[])
	{
		Console con=System.console();
	//	System.out.print("Enter Name ");
		String name=con.readLine("Enter Name ");
		System.out.println("hi "+name);
	}
}