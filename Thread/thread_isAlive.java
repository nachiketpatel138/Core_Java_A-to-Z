import java.io.*;
class One extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
}
class ThreadRunnable
{
	public static void main(String[] args)
	{
		One o=new One();
		System.out.println("before start()");
		
		if(o.isAlive())
			System.out.println("I Am Alive");
		else
			System.out.println("I Am not Alive");
				
		o.start();
		System.out.println("after start()");
				
		if(o.isAlive())
			System.out.println("I Am Alive");
		else
			System.out.println("I Am not Alive");
				
		try
		{
			Thread.currentThread().sleep(0);
		}
		catch(InterruptedException e)
		{
		}
		
		if(o.isAlive())
			System.out.println("I Am Alive");
		else
			System.out.println("I Am not Alive");
				
	}
}