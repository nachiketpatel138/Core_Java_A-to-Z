import java.io.*;
class RandomAccessFileDemo
{
	public static void main(String[] args)throws IOException
	{
		RandomAccessFile raf=new RandomAccessFile("D:\\nachiket\\java\\Random.txt","rw");
		raf.writeChar('A');
		raf.writeInt(1234);
		raf.writeDouble(123.45);
		
		raf.seek(0);
		System.out.println(raf.readChar());
		System.out.println(raf.readInt());
		System.out.println(raf.readDouble());
		
		raf.seek(2);
		
		System.out.println(raf.readInt());
		
		raf.writeInt(25);
		raf.seek(raf.length());// End of the file
		raf.writeBoolean(false);
		raf.seek(14);
		System.out.println(raf.readBoolean());
		raf.close();
	}
}