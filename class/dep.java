import java.io.*;
class dep
{
	public static void main(String args[])
	{
		int ir;
		ir=25000;
		int dep;
		dep=ir*30/100;
		System.out.println("Your Item Value\t\t"+ir);
		System.out.println("dep(30%)       \t\t"+dep);
		System.out.println("------------------------------");
		System.out.println("value is       \t\t"+(ir-dep));
	}
}