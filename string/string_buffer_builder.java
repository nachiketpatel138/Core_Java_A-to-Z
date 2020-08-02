import java.io.*;
class string
{
	public static void main(String[] args)
	{
		StringBuilder sb1=null;
		StringBuilder sb2=new StringBuilder();
		StringBuilder sb3=new StringBuilder("java");
		StringBuilder sb4=new StringBuilder(10);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb3.length());
		System.out.println(sb4.capacity());
	}
}