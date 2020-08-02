import java.io.*;
class One extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			if(i==1)
			{
				System.out.println("suspend");
				suspend();
			}
			System.out.println("One"+i);
		}
	}
}
class suspendMethod
{
	public static void main(String[] args)
	{
		System.out.println("Main start");
		One o=new One();
		o.start();
		for(int i=1;i<=10;i++)
		{
		System.out.println("Main"+i);
		if(i==10)
		{
			o.resume();
			System.out.println("resume");
		}
		}
		System.out.println("MAin End");
	}
}