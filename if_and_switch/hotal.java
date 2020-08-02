import java.io.*;
class hotel
{
	public static void main(String args[])
	{
		Console con=System.console();
		System.out.println("1. class A");
		System.out.println("2. class B");
		System.out.println("3. class C");
		int op=Integer.parseInt(con.readLine("enter your choice"));
		
		int hr=Integer.parseInt(con.readLine("enter your hour"));
		int day=hr/24;
		int hour=hr-(day*24);
		System.out.println("day"+day+"hour"+hour);
		
		int amount=(op==1)?15000*day:(op==2)?10000*day:(op==3)?5000*day:0;
		if(hour>12)
		{
			amount+=(op==1)?15000:(op==2)?10000:(op==3)?5000:0;
			hour=0;
		}
		if(hour!=0)
		{
			int s1=	(op==1)?1500:(op==2)?1000:(op==3)?500:0;
			int s2=	(op==1)?1600:(op==2)?1100:(op==3)?550:0;
			int s3=	(op==1)?1700:(op==2)?1200:(op==3)?600:0;
			
			if(hour>=7)
			{
				amount+=(hour-6)*s3;
				hour=6;
			}
			if(hour>=4)
			{
				amount+=(hour-3)*s2;
				hour=3;
			}
			if(hour>=1)
			{
				amount+=hour*s1;
				hour=0;
			}
			}
			System.out.println("amount"+amount);
		
			
     }
}