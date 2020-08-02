import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		File f1=new File("D:\\nachiket\\java\\c.txt");
		
		System.out.println(f1.delete());
	}
}