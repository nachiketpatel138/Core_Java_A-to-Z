import java.io.*;
class readfile
{
	public static void main(String []args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:/nachiket/java/java soft_program/my.txt");
		int ch;
		while((ch=fis.read())!=-1)
			System.out.print((char)ch);
			
			System.out.println();
			fis.close();
	}
}