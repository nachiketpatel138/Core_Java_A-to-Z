import java.io.*;
class readfile
{
	public static void main(String []args)throws IOException
	{
		File f=new File("D:/nachiket/java/java soft_program/my.txt");
		FileInputStream fis=new FileInputStream(f);
		int ch;
		while((ch=fis.read())!=-1)
			System.out.print((char)ch);
			
			System.out.println();
			fis.close();
	}
}