import java.io.*;
class string
{
	public static void main(String[] args)
	{
		
		StringBuilder sb3=new StringBuilder("java");
		sb3.insert(4," program");
		
		System.out.println(sb3);
		System.out.println(sb3.length());
		//insert(int offset,boolean b) /char c /char[] str/char str,int offset,int len/double d/float f/int i/long l/Object obj/String str
		//same use as append
	}
}