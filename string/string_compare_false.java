import java.io.*;
class string
{
	public static void main(String[] args)
	{
		String str1="myjava";
		String str2="myjava";
		System.out.println("str1==str2  ="+(str1==str2));
		String str3=new String("myjava");
		System.out.println("str1==str3  ="+(str1==str3));
		String str4=new String("myjava");
		System.out.println("str3==str4  ="+(str3==str4));
		String str5=new String("MYJAVA");
		System.out.println("str4==str5  ="+(str4==str5));
		
	}
}