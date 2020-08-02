import java.io.*;
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
		Two t=new Two();
		Thread t2=new Thread(t);
		t2.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("main"+i);
		}
	}
}