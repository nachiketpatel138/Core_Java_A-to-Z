import java.io.*;
class HoldAmount
{
	private int amount;
	private boolean empty=true;
	synchronized public void setSharedAmount(int value)
	{
		while(!empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		amount=value;
		empty=false;
		notify();
	}
	synchronized public int getSharedAmount()
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
			notify();
			empty=true;
			return amount;
	}
}
class Producer extends Thread
{
	private HoldAmount phold;
	public Producer(HoldAmount h)
	{
		phold=h;
	}
	public void run()
	{
		for(int count=1;count<=10;count++)
		{
			int setAmount=(int)(Math.random()*10000);
			phold.setSharedAmount(setAmount);
			System.out.println("Producer assigned "+setAmount);
			try
			{
				sleep((int)(Math.random()*1000));
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

class Consumer extends Thread
{
	private HoldAmount chold;
	public Consumer(HoldAmount h)
	{
		chold=h;
	}
	public void run()
	{
		int value;
		value=chold.getSharedAmount();
		System.out.println("Consumer retrived"+value);
		for(int count=1;count<10;count++)
		{
			try
			{
				sleep((int)(Math.random()*1000));
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			value=chold.getSharedAmount();
			System.out.println("Consumer retrived"+value);
		}
	}
}
class Sharedall
{
	public static void main(String[] args)
	{
		HoldAmount h=new HoldAmount();
		Producer p=new Producer(h);
		Consumer c=new Consumer(h);
		p.start();
		c.start();
	}
}