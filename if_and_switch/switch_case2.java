import java.io.*;
class vovel
{
	public static void main(String args[])
	{
		Console con=System.console();
	    //String	 str=con.readLine(("enetr the string"));
		char ch=con.readLine("enter the string").charAt(0);
		switch(ch)
		{
			case 'a':
			case 'A':	
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':	
			case 'u':
			case 'U':
				System.out.println("vovel");
				break;
			default :
				System.out.println("no vovel");
				break;99				
		}
	}
}