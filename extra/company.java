import java.io.*;
class er
{
	public static void main(String arg[])
	{
		Console con=System.console();
		double unit=Double.parseDouble(con.readLine("Enter a Unit         "));
		int PD=Integer.parseInt(con.readLine("Enter a payment Date   "));
		
		if(unitV(unit))
		{
			if(PDV(PD))
			{
				double unitrs;
				boolean boo=cds(PD);
				double cal;
				System.out.println("PD");
				if(unit<=200)
				{
					unitrs=unit*2.50;
					System.out.println("unit rs   = "+unitrs);
					if(boo)
					{
						cal=unitrs*.05;
						System.out.println("DISCOUNT = "+cal);
						System.out.println("CC       = "+(unitrs-cal));
					}
					else
					{
						cal=unitrs*.1;
						System.out.println("Charge = "+cal);
						System.out.println("CC       = "+(unitrs+cal));
					}
				}
				else if(unit<=500)
				{
					unitrs=(unit-200)*3.50+500;
					System.out.println("unit rs="+unitrs);
					if(boo)
					{
						cal=unitrs*.05;
						System.out.println("DISCOUNT = "+cal);
						System.out.println("CC       = "+(unitrs-cal));
					}
					else
					{
						cal=unitrs*.1;
						System.out.println("Charge = "+cal);
						System.out.println("CC       = "+(unitrs+cal));
					}	
				}
				else 
				{
					unitrs=(unit-500)*5.00+500+1050;
					System.out.println("unit rs="+unitrs);
					if(boo)
					{
						cal=unitrs*.05;
						System.out.println("DISCOUNT = "+cal);
						System.out.println("CC       = "+(unitrs-cal));
					}
					else
					{
						cal=unitrs*.1;
						System.out.println("Charge = "+cal);
						System.out.println("CC       = "+(unitrs+cal));
					}
				}
			}
			else
			{
				System.out.println("Payment date invalid ");
			}
		}
		else
		{
			System.out.println("Unit Invalied ");
		}
		
	}
	
	public static boolean cds(int d) 
	{
		
		if(d<=15)
			return true;
		else
			return false;
	}
	public static boolean unitV(double unit) 
	{
		
		if(unit>0)
			return true;
		else
			return false;
	}
	public static boolean PDV(int PD) 
	{
		if(PD>0 && PD<=31)
			return true;
		else
			return false;
	}
	
}