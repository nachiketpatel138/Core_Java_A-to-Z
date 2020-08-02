import java.io.*;
class shop
{
	public static void main(String[] args)
	{
		Console con=System.console();
		System.out.println("Hire rate per day");
		System.out.println("Model No. 1  14.00");
		System.out.println("Model No. 2  12.00");
		System.out.println("Model No. 3  10.00");
		int op=Integer.parseInt(con.readLine("Enter a Option "));
		
		int dis,da,paid;
		
		
		if(op==1)
		{
			int day=Integer.parseInt(con.readLine("Enter a day "));
			System.out.println();
			da=day*14;
			if(day<=5)
			{
				
				System.out.println("Day*Rate("+day+"*14)=   "+da);
				System.out.println("No Discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				paid=da-30;
				System.out.println("--------------------------------------");
				System.out.println("paid       =       "+paid);	
			}
			else if(day<=10)
			{
				System.out.println("Day*Rate("+day+"*14)=   "+da);
				System.out.println("8% discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				dis=da*8/100;
				System.out.println("dis               "+dis);
				paid=da-30;
				System.out.println("--------------------------------------");
				System.out.println("paid      =       "+paid);		
			}
			else if(day>=11)	
			{
				System.out.println("Day*Rate("+day+"*14)=   "+da);
				System.out.println("15% discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				dis=da*15/100;
				System.out.println("dis               "+dis);
				paid=da-dis-30;
				System.out.println("--------------------------------------");
				System.out.println("paid       =      "+paid);	
				
			}
		}
	    else if(op==2)
		{
			int day=Integer.parseInt(con.readLine("Enter a day "));
			System.out.println();
			da=day*12;
			if(day<=5)
			{
				
				System.out.println("Day*Rate("+day+"*12)=   "+da);
				System.out.println("No Discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				paid=da-30;
				System.out.println("--------------------------------------");
				System.out.println("paid       =       "+paid);	
			}
			else if(day<=10)
			{
				System.out.println("Day*Rate("+day+"*12)=   "+da);
				System.out.println("8% discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				dis=da*8/100;
				System.out.println("dis               "+dis);
				paid=da-30;
				System.out.println("--------------------------------------");
				System.out.println("paid      =       "+paid);		
			}
			else if(day>=11)	
			{
				System.out.println("Day*Rate("+day+"*12)=   "+da);
				System.out.println("15% discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				dis=da*15/100;
				System.out.println("dis               "+dis);
				paid=da-dis-30;
				System.out.println("--------------------------------------");
				System.out.println("paid       =      "+paid);	
				
			}	
		}
		else if(op==3)
		{
			int day=Integer.parseInt(con.readLine("Enter a day "));
			System.out.println();
			da=day*10;
			if(day<=5)
			{
				
				System.out.println("Day*Rate("+day+"*10)=   "+da);
				System.out.println("No Discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				paid=da-30;
				System.out.println("--------------------------------------");
				System.out.println("paid       =       "+paid);	
			}
			else if(day<=10)
			{
				System.out.println("Day*Rate("+day+"*10)=   "+da);
				System.out.println("8% discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				dis=da*8/100;
				System.out.println("dis               "+dis);
				paid=da-30;
				System.out.println("--------------------------------------");
				System.out.println("paid      =       "+paid);		
			}
			else if(day>=11)	
			{
				System.out.println("Day*Rate("+day+"*10)=   "+da);
				System.out.println("15% discount");
				System.out.println("--------------------------------------");
				System.out.println("Total             "+da);
				System.out.println("Diposit           30");
				dis=da*15/100;
				System.out.println("dis               "+dis);
				paid=da-dis-30;
				System.out.println("--------------------------------------");
				System.out.println("paid       =      "+paid);	
				
			}
		}
		else
		{
			System.out.println("Invaild option");
		}
	}
}