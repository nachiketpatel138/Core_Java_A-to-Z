import java.io.*;
class One extends Thread
{
	int enter=0;
	boolean end=true;
	public One(String name,int priority)
	{
		super(name);
		setPriority(priority);
	}
	public void run()
	{
		while(end)
		{
			enter++;
		}
	}
	public void end()
	{
		end=false;
	}
}
class PriorityMethod
{
	public static void main(String[] args)
	{
		One o1=new One("Max",10);
		One o2=new One("Noerm",5);
		One o3=new One("Min",1);
		o1.start();
		o2.start();
		o3.start();
		try{
			Thread.currentThread().sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
		o1.end();
		o2.end();
		o3.end();
		System.out.println(o1.getName()+"\tPriority in int"+o1.getPriority()+"\tEnter\t"+o1.enter);
		System.out.println(o2.getName()+"\tPriority in int"+o2.getPriority()+"\tEnter\t"+o2.enter);
		System.out.println(o3.getName()+"\tPriority in int"+o3.getPriority()+"\tEnter\t"+o3.enter);
	}
}