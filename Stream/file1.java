import java.io.*;
class copyfile
{
	public static void main(String[] args)throws IOException
	{
		if(args.length>2)
		{
			System.out.println("too many parameteers");
			System.exit(0);
		}
		else
			if(args.length<2)
			{
				System.out.println("parameter Missing");
				System.exit(0);
			}
		File f=new File(args[0]);
		if(!f.exists())
		{
			System.out.println("source file does not exit");
			System.exit(0);
		}
			FileInputStream fis=new FileInputStream(args[0]);
			FileOutputStream fos=new FileOutputStream(args[1]);
			int ch;
			while((ch=fis.read())!=-1)
				fos.write(ch);
				System.out.println("File Copy");
				fis.close();
				fos.close();
	}
}