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
class Two implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Two"+i);
		}
	}
}
class ThreadRunnable
{
	public static void main(String[] args)
	{
		One o=new One();
		o.start();
		Two t=new Two();
		Thread t2=new Thread(t);
		t2.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main"+i);
		}
	}
}