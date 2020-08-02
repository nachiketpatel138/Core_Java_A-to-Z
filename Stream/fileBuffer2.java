import java.io.*;
class bufferedIO
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:/nachiket/java/if.jpg");
		BufferedInputStream bis=new BufferedInputStream(fis);
		//(fis.1024)->for increase Buffer size
		//Buffer by default contain
		//500 byte
		FileOutputStream fos=new FileOutputStream("D:/nachiket/java/copy/ifc1.jpg");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read())!=-1)
		{
			bos.write(ch);
		}
		bis.close();
		bos.close();
	}
}