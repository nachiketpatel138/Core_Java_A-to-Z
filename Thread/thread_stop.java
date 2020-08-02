import java.io.*;
class One extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			if(i==2)
			{
				System.out.println("Stop...");
				stop();
			}
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
	}
}