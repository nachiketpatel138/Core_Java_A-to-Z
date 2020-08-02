import  java.io.*;
class One extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("One"+i);
			try
			{
					sleep(1000);
			}
			catch(InterruptedException e)
			{	
			}
		}
	}
}
class Two implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("two"+i);
		try
		{
			Thread.currentThread().sleep(500);
		}
		catch(InterruptedException e){
	}
		}
	}
}
class sleepMethod
{
	public static void main(String[] args)
	{
		One o=new One();
		Two t=new Two();
		Thread t2=new Thread(t);
		o.start();
		t2.start();
	}
}