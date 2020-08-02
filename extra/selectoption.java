import java.io.*;
class b
{
	public static void main(String[] arg)
	{
		Console con=System.console();
		System.out.println("Option 1");
		System.out.println("Option 2");
		System.out.println("Option 3");
		int op=Integer.parseInt(con.readLine("Enter a Option "));
		
		if(op==1)
		{
			System.out.println("Option 1");
		}
		else 
			if(op==2)
			{
				System.out.println("Option 2");
			}
			else
				if(op==3 || op==-3)
				{
					System.out.println("Option 3");
				}
				else
				{
					System.out.println("Invalied option");
				}
				
			
		
		
	}	
}