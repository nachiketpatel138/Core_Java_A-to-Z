import java.io.*;
class command
{
	public static void main(String...args)
	{
		System.out.println("command line");
		for(int i=0;i<args.length;i++)
		{
			System.out.print("command line arg value");
			System.out.println((i+1)+" "+args[i]);
		}
	}
}