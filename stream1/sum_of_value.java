import java.io.*;
import java.util.*;
class sumStringValue
{
	public static void main(String[] args)throws IOException
	{
		Console con=System.console();
		int no,sum=0;
		String str=con.readLine("Enter the value");
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			no=Integer.parseInt(st.nextToken());
			sum+=no;
		}
		System.out.println("Total "+sum);
	}
}