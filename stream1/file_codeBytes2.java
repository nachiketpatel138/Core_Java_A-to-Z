import java.io.*;
class file
{
	public static void main(String[] args)throws IOException
	{
		
		File f1=new File("D:\\nachiket\\java\\copy\\read.txt");
		FileInputStream fis=new FileInputStream("D:\\nachiket\\java\\copy\\read.txt");
		
		long fsize=f1.length();
		System.out.println("Size "+fsize);
		
		Console con=System.console();
		
		int size=Integer.parseInt(con.readLine("Enter a Byte Size "));
		System.out.println("Number of File "+(fsize/(size)));
		int j=1,ch,k=10;
		for(int i=1;i<=fsize/size;i++)
		{
			
			FileOutputStream fos=new FileOutputStream("D:\\nachiket\\java\\copy\\s\\"+i+"my.txt");
		
			while((ch=fis.read())<=size)
			{	
					fos.write(ch);
					System.out.println(ch);		
			}
				size+=size;
		}
	}
}

		