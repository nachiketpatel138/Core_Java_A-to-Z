import java.io.*;
class Auto_BoxingandUnBoxing
{
	public static void main(String[] args)
	{
		Integer iObj=100;
		System.out.println("iObj init value is"+iObj);
		iObj++;
		System.out.println("after increment iObj value is"+iObj);
		
		Double dObj=3.14;
		//-iObj=dObj+iObj;
		dObj=dObj+iObj;
		System.out.println("after addtion "+dObj);
		
		iObj=100*2+25;
		System.out.println("after Expression iObj value is"+iObj);
	}
}