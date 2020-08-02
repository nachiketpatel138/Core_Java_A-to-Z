import java.io.*;
class employee
{
	public static void main(String arg[])
	{
		Console con=System.console();
		int income=Integer.parseInt(con.readLine("enter the employee income"));
		int l=Integer.parseInt(con.readLine("enter the le"));
		int o=Integer.parseInt(con.readLine("enter the ov"));
		int perday=income/30;
		int perhr=perday/10;
		
		
		if(PDV(l));
		
		
		else if(l<=2)
		{
		System.out.println("no extra charge");
		int INCOME=income+o*perhr;
		System.out.println("your income is "+INCOME);
		}
		else if(l<=7)
		{
			System.out.println("less per day and 5% extra charge");	
			int i=(l*perday);
			int ic=income*5/100;
			int INCOME=(income-ic-i)+2*(perday)+o*perhr;
			System.out.println("your income is"+INCOME);
		}
		else if(l<=11)
		{
			System.out.println("less per day and 7% extra charge");	
			int i=(l*perday);
			int ic=income*7/100;
			int INCOME=income-ic-i+2*(perday)+o*perhr;
			System.out.println("your income is"+INCOME);
	    }
	    else if(l<=16)
		{
			System.out.println("less per day and 10% extra charge");	
			int i=(l*perday);
			int ic=income*10/100;
			int INCOME=income-ic-i+2*(perday)+o*perhr;
			System.out.println("your income is"+INCOME);
	    }
	    else if(l<=22)
		{
			int INCOME=income-income;
			System.out.println("your income is"+INCOME);
	    }
	}
	public static boolean PDV(int PD) 
	{
		if(PD>0 && PD<=31)
			return true;
		else
			return false;
	}
}
	    
	    
