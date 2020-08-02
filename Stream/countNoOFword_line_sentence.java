import java.io.*;
class count
{
	public static void main(String[] args)throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\nachiket\\java\\my.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
	//	FileOutputStream fos=new FileOutputStream("D:\\nachiket\\java\\copy\\count.txt");
	//	BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch;
		int i=0,s=0,w=0,csp=1;
		while((ch=bis.read())!=-1)
		{
			if(ch==13)
			{
				i++;
			}
			if(ch=='.')
			{
				s++;
			}
			if(ch==32 && csp!=' ')
			{
				w++;
			}
			csp=ch;
		}
		System.out.println("Number of line ="+i);
		System.out.println("Number of s ="+s);
		System.out.println("Number of w ="+w);
		bis.close();
		
	}
}