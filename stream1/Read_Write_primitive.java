import java.io.*;
class Read_Write
{
	public static void main(String[] args)throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D:\\nachiket\\java\\copy\\data.bin");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeChar('a');
		dos.writeInt(12345);
		dos.writeDouble(123.35);
		dos.writeBoolean(false);
		dos.close();
		
		FileInputStream fis=new FileInputStream("D:\\nachiket\\java\\copy\\data.bin");
		DataInputStream dis=new DataInputStream(fis);
		
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readBoolean());
		dis.close();
	}
}