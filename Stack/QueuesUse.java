import java.io.*;
class StackClassUse
{
	public static void main(String[] args)
	{
		Console con=System.console();
		QueuesClass qc=new QueuesClass();
		while(true)
		{
			System.out.println("1 enqueues");
			System.out.println("2 dequeues");
			System.out.println("3 display");
			System.out.println("4 peek");
			System.out.println("5 exit");
			
			System.out.println("");
			int m=Integer.parseInt(con.readLine("Enter any option"));
			
			switch(m)
			{
				case 1:
					qc.enqueues(Integer.parseInt(con.readLine()));
					break;
				case 2:
					qc.dequeues();
					break;
				case 3:
					qc.display();
				case 4:
					System.out.println(qc.peek());
					break;
				case 5:
					System.out.println("thx");			
						System.exit(0);
						break;
			}
		}
	}
}
