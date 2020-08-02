import java.io.*;
class pv
{
	public static void main(String[] args)	
	{
		Console con=System.console();
		int m=Integer.parseInt(con.readLine("EAM "));
		System.out.println("Your gread "+gread(m));
	}
	public static char gread(int mark)
	{
		if(mark>=90)
				return 'A';	
		else if(mark>=70)
				return 'B';
		else if (mark >=60)
				return 'C';
		else if (mark >=40);
				return 'D';
	}
	
	
}