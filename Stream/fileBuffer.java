import java.io.*;
class bufferedIO
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:/nachiket/java/if.jpg");
		
		//(fis.1024)->for increase Buffer size
		//Buffer by default contain
		//500 byte
		FileOutputStream fos=new FileOutputStream("D:/nachiket/java/copy/ifc.jpg");
		
		int ch;
		while((ch=fis.read())!=-1)
		{
			fos.write((char)ch);
		}
		fis.close();
		fos.close();
	}
}