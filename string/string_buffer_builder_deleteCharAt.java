import java.io.*;
class string
{
	public static void main(String[] args)
	{
		
		StringBuilder sb3=new StringBuilder("javaprogram");
		sb3.deleteCharAt(4);
		
		System.out.println(sb3);
		//delete
		sb3.delete(4,sb3.length());
	    System.out.println(sb3);
	}
}