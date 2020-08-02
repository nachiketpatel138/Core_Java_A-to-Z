import java.io.*;
class cal
{
	public static void main(String args[])
	{
		System.out.println("add =1");
		System.out.println("sub =2");
		System.out.println("mul =3");
		System.out.println("div =4");
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the choice"));
		
		String msg=(value==1)?"add" :(value==2)? "sub" : (value==3) ? "mul" : "div";
		
		msg(msg);
		int first=Integer.parseInt(con.readLine("enter the frist value"));
		int second=Integer.parseInt(con.readLine("enter the second value"));
		switch(value)
		{
			case 1:
				System.out.println("add");
				add();
				break;
			case 2:
				System.out.println("sub");
				break;
			case 3:
				System.out.println("mul");
				break;
			case 4:
				System.out.println("div");	
					break;
			default :
				System.out.println("Invaild");
				break;
		}
		}
			public static void add()
			{
				
					 int total=0;//first+second;
					System.out.println("total "+total);
					
			}
			public static void msg(String msg)
			{
				
				System.out.println("Read two value for "+msg);
				
			}
	}
