import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		File f1=new File("D:\\nachiket\\java\\re2.txt");
		File f2=new File("D:\\nachiket\\java\\copy\\re2.txt");
		System.out.println(f1.renameTo(f2));
	}
}