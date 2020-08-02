import java.io.*;
class Sequence_Input_stream
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis1=new FileInputStream("D:\\nachiket\\java\\mya.txt");
		FileInputStream fis2=new FileInputStream("D:\\nachiket\\java\\mya.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		FileOutputStream fos=new FileOutputStream("D:\\nachiket\\java\\copy\\mya.txt");
		int ch;
		while((ch=sis.read())!=-1)
		{
			fos.write(ch);
		}
			
			sis.close();
			fos.close();
	}
}