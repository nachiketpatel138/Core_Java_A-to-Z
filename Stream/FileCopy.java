import java.io.*;
class FileCopy
{
	public static void main(String[] args)throws IOException
	{	
			int ch;
			int i=0;
			FileOutputStream fos=new FileOutputStream(args[args.length-1]);
			
			while(i<args.length-1)
			{
				FileInputStream fis=new FileInputStream(args[i]);
				
				while((ch=fis.read())!=-1)
					{
						fos.write(ch);
					}
					i++;
					fis.close();
			}
				
		//		fos.close();
	}
}