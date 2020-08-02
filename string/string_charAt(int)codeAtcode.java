import java.io.*;
class string
{
	public static void main(String[] args)
	{
		String str="java";
		char ch;
		ch=str.charAt(2);
		System.out.println(ch);
		System.out.println();
		
		//codeAt
		
		String str1="java";
		System.out.println(str.codePointAt(1));
		System.out.println();
		
		//code point before
		
		String str2="Java";
		System.out.println(str2.codePointBefore(1));
		System.out.println();
			
		// start with end with
	
		String str3="java program";
		System.out.println(str3.startsWith("java"));
		System.out.println(str3.startsWith("va"));
		System.out.println(str3.endsWith("java"));
		System.out.println(str3.endsWith("ram"));
		System.out.println();
		
		//concat
		
		String str5="A";
		String str4="D";
		String result=str5.concat(str4);
		System.out.println(result);
		System.out.println();
		
		//copyvalueof
		
		char arr[]={'j','a','v','a'};
		String str6=String.copyValueOf(arr);
		System.out.println(str6);
		System.out.println();
		//toCharArray
		
		String str7="java";
		char ary[];
		ary=str.toCharArray();
		System.out.println(ary);
		System.out.println();
		
		//getchars
		
		String str8="java language";
		char ch1[]=new char[10];
		str8.getChars(5,12,ch1,1);
		System.out.println(str8);
		System.out.println();
		
		//indexof or lastindexof
		
		String str9="nachikecht++123";
		
		
		System.out.println();
		System.out.println(str9.indexOf("ch",3));
		System.out.println(str9.lastIndexOf("ch",6));
		System.out.println();
		
		//replace  replaceall  replacefirst
		
		String strreplace="java program";
		System.out.println(strreplace.replace("a","A"));
		System.out.println(strreplace.replaceAll("a",""));
		System.out.println(strreplace.replaceFirst("a","A"));
		System.out.println();
		
	    //trim
	    
	    String str10="java  program";
	    System.out.println("my"+str10.length());
	    str10=str10.trim();
		System.out.println("my"+str10.length());
		System.out.println();
		
		//lowercase uppercase
		
		String str11="java progrm";
		System.out.println(str11.toLowerCase());
		System.out.println(str11.toUpperCase());
		System.out.println();
		//substring
		
		String str12="java program";
		System.out.println(str12.substring(5));
		System.out.println(str12.substring(5,8));
		System.out.println();
		//valueof
		
		String str13=String.valueOf(123);
		System.out.println(str13);
		//primetive data type
	}
}