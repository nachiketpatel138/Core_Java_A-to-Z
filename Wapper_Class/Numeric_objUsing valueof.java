import java.io.*;
class Usingvalueof
{
	public static void main(String[] args)
	{
		System.out.println("Converting Numeric String To Numeric Objects Using valueof");
		String str1="25";
		String str2="25.25";
		String str3="A";
		Byte bObj1=Byte.valueOf(str1);
	//	Byte bObj2=Byte.valueOf(str2);
	//	Byte bObj3=Byte.valueOf(str3);
		System.out.println(bObj1);
		
		System.out.println("Converting Numeric String To Numeric Objects Using Constructor");
		
		Byte bObj4=new Byte(str1);
	//	Byte bObj5=new Byte(str2);
	//	Byte bObj6=new Byte(str3);
		System.out.println(bObj4);
		
		System.out.println("Converting Numeric String To Numeric Objects Using parseXXX()");
		
		Byte bObj7=Byte.parseByte(str1);
	//	Byte bObj8=Byte.parseByte(str2);
	//	Byte bObj9=Byte.parseByte(str3);
		System.out.println(bObj7);
		
		System.out.println("Converting Numeric String To Primitive Number Using parseXXX()");
		
		Byte b1=Byte.parseByte(str1);
	//	Byte b2=Byte.parseByte(str2);
	//	Byte b2=Byte.parseByte(str3);
		System.out.println(b1);
		
	}
}