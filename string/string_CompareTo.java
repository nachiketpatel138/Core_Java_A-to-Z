
import java.io.*;
class compare
{
	public static void main(String[] args)
	{
		String str1="A";
		String str2="A";
		int result=str1.compareTo(str2);
		System.out.println(result);
		System.out.println();
		String str3="C";
		String str4="A";
		result=str3.compareTo(str4);
		System.out.println(result);
		System.out.println();
		
		//compare to 
		
		String str5="C";
		String str6="c";
		result=str5.compareTo(str6);
		System.out.println(result);
		System.out.println();
		
		//compare to ignore case
		
		String str7="c";
		result=str5.compareToIgnoreCase(str7);
		System.out.println(result); 
	}
}