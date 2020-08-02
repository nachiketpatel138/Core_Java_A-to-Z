import java.io.*;
class Auto_BoxingandUnBoxing
{
	public static int method(Integer i)
	{
		return i;
	}
	public static void main(String[] args)
	{
		Integer iObj=method(125);
		System.out.println(iObj);
		
		int iObj1=method(250);
		System.out.println(iObj1);
	}
}