import java.io.*;
import java.util.*;

class vector
{
	public static void main(String[] args)
	{
		Console con=System.console();
		vectorclass vc=new vectorclass();
		while(true)
		{
			System.out.println("1 push");
			System.out.println("2 pop");
			System.out.println("3 display");
			System.out.println("4 exit");
			int m=Integer.parseInt(con.readLine("Enter any option"));
			switch(m)
			{
				case 1:
					vc.push();
					break;
				case 2:
					vc.pop();
					break;
				case 3:
					vc.display();
					break;
				case 4:
					System.out.println("thx");			
					System.exit(0);
			}
		}
	}
}
class vectorclass
{
static	 Vector v=new Vector();

			public static void push()
			{
				Console con=System.console();
				int valu=Integer.parseInt(con.readLine("enter the  value"));
				v.add(valu);
			}
			
			public static void display()
				{
					Iterator obj=v.iterator();
					while(obj.hasNext())
					{
					System.out.println(obj.next());
					}
				}
			public static void pop()
			{
				if(v.size()!=0)
					
					v.remove(v.size()-1);
				else
				{
					
				}
			}
}