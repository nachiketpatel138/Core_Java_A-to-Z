import java.io.*;
class Mearge
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:/nachiket/java/my.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileInputStream fis1=new FileInputStream("D:/nachiket/java/mya.txt");
		BufferedInputStream bis1=new BufferedInputStream(fis1);
		FileOutputStream fos=new FileOutputStream("D:/nachiket/java/copy/mearge.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read())!=-1)
		{
			bos.write(ch);
		}
		bos.write(13);
		bos.write(10);
			while((ch=bis1.read())!=-1)
			{
				bos.write(ch);
			}
		bis.close();
		bis1.close();
		bos.close(); 
	}
}