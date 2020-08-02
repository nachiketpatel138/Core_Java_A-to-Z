import java.io.*;
class string
{
	public static void main(String[] args)
	{
		String str1="myjava";
		String str2="myjava";
		System.out.println("str1 equals str2  ="+(str1.equals(str2)));
		System.out.println();
		String str3=new String("myjava");
		System.out.println("str1 equals str3  ="+(str1.equals(str3)));
		System.out.println();
		String str4=new String("myjava");
		System.out.println("str3 equals str4  ="+(str3.equals(str4)));
		System.out.println();
		String str5=new String("MYJAVA");
		System.out.println("str4 equals str5s  ="+(str4.equals(str5)));
		System.out.println();
		String str6=new String("MYJAVA");                                        //compareIgnoreCase
		System.out.println("str4 equals str6s  ="+(str4.equalsIgnoreCase(str6)));
	}
}