import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:/nachiket/java/java soft_program/my.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("D:/nachiket/java/copy/myyy.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch;
			while ((ch = bis.read()) != -1)
			{
			        ch=Character.toUpperCase(ch);
					bos.write((char)ch);
			}	
		bis.close();
		bos.close();
	}
}
