import java.io.*;
class day
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the number"));
		switch(value)
		{
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;	
			case 3:
				System.out.println("Wednesday");
				break;	
			case 4:
				System.out.println("Thursday");
				break;	
			case 5:
				System.out.println("Firday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;		
			default :
				System.out.println("invalid day");		
		}
	}
}