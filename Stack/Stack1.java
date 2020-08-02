
import java.io.*;
class stack
{
	static	int a[]=new int[5];
	static	int top=-1;
	static Console con=System.console();
	public static void main(String [] args)
	{
		while(true)
		{
			System.out.println("(1) push");
			System.out.println("(2) pup");
			System.out.println("(3) display");
			System.out.println("(4) exit");
			System.out.println("(5) peek");
			int value=Integer.parseInt(con.readLine("enter the number of choice"));
			switch(value)
			{
				case 1:
					push();
					break;
				case 2:
					pop();
					break;
				case 3:
					Display();
					break;
				case 4:
					System.out.println("bye");
					break;
				case 5:
					peek();
					break;
				default :
					System.out.println("Invalid");
					break;		
			}
			if(value==6)
				break;
		}
	}
	public static void push()
	{
		if(top>3)
		{
			isFull();
		}
		else
		a[++top]=Integer.parseInt(con.readLine("enter the value"));
	}
	public static void pop()
	{
		if(top==-1)
		{
			isEmpty();
		}
		else
		{
		
			top--;
		}
	}
	public static void Display()
	{
			for(int i=0;i<=top;i++)
			System.out.println("|"+a[i]+"|");
			System.out.println();	
	}
	public static void isEmpty()
	{
		System.out.println("stack is Empty");
	}
	public static void isFull()
	{
			System.out.println("      full");
	}
	public static void peek()
	{
		System.out.println("|"+a[top]+"|");
	}
}