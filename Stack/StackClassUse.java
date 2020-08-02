import java.io.*;
class StackClassUse
{
	public static void main(String[] args)
	{
		Console con=System.console();
		stackclass sc=new stackclass();
		while(true)
		{
			System.out.println("1 push");
			System.out.println("2 pop");
			System.out.println("3 display");
			System.out.println("4 peek");
			System.out.println("5 exit");
			
			System.out.println("");
			int m=Integer.parseInt(con.readLine("Enter any option"));
			
			switch(m)
			{
				case 1:
					sc.push(Integer.parseInt(con.readLine()));
					break;
				case 2:
					sc.pop();
					break;
				case 3:
					sc.display();
				case 4:
					System.out.println(sc.peek());
					break;
				case 5:
					System.out.println("thx");			
						System.exit(0);
						break;
			}
		}
	}
}