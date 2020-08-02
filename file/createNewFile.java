import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		File f1=new File("D:\\nachiket\\java\\ab.txt");
		
		System.out.println(f1.createNewFile());
	}
}