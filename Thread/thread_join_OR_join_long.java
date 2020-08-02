import java.io.*;
class One extends Thread
{
	public void run()
	{
		for(int i=1;i<=300;i++)
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
		o.start();
		
		System.out.println("Alive value is"+o.isAlive());
		try
		{
			o.join(1);
			System.out.println("join.........");
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Alive value is"+o.isAlive());
	}
}