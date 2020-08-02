import java.io.*;
import java.util.*;
class StringTokenizerDemo
{
	public static void main(String[] args)throws IOException
	{
		String str="I like JAva";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}