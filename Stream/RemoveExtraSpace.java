import java.io.*;
class RemoveExtraSpace
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\nachiket\\java\\my.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("D:\\nachiket\\java\\ExtraSpace.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch,save=0;
		
		while((ch=bis.read())!=-1)
		{
				if(ch!=32)
					bos.write((char)ch);
				else
					if(save!=32)
						bos.write((char)ch);	
			
			save=ch;
		}	
			bis.close();
			bos.close();
	}
}