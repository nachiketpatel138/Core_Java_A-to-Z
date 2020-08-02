import java.io.*;
class One extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("One"+i);
		}
	}
}

class ThreadRunnable
{
	public static void main(String[] args)
	{
		One o=new One();
		o.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main"+i);
		}
	}
}