import java.io.*;
class gra
{
	public static void main(String[] args)
	{
		Console con=System.console();
			int a=Integer.parseInt(con.readLine("eneter the number"));
			int b=Integer.parseInt(con.readLine("eneter the number"));
			int c=Integer.parseInt(con.readLine("eneter the number"));
				
			if(a>b)
			{
				if(a>c)
					System.out.println("A = "+a);
				else
					System.out.println("C = "+c);
			}
			else
				if(b>c)
				{
					System.out.println("B = "+b);
				}
				else 
					System.out.println("C = "+c);
		
	}
}