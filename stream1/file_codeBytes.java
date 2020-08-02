import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		
		File f1=new File("D:\\nachiket\\java\\my.txt");
		FileInputStream fis=new FileInputStream("D:\\nachiket\\java\\my.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("D:\\nachiket\\java\\copy\\my.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch,j=0,k=0;
//		while(k<=f1.length())
		{
		
		while((ch=bis.read())!=-1)
		{
			while(j<)
			{
				bos.write(ch);
				System.out.print((char)ch);
			}
		j++;
		}
//			k++;
//		}
	}
}
