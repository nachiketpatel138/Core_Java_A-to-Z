import java.io.*;
class a
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the vlaue"));
		int amount,tax;
		int val,va,v,valu;
			
			if(value<=250000)
			{
				System.out.println("no tax");
			}
			else if(value<=400000)
			{
				amount=value-250000;
				System.out.println("amount"+amount);
				System.out.println("10% tax");
				val=amount*10/100;
				System.out.println("val=  "+val);
			}
			else if(value<=500000)
			{
				va=value-400000;
				
				val=va*20/100;
				v=150000*10/100;
				tax=v+val;
				System.out.println("tax"+tax);	
			}
			else if(value>=500000)
			{
				va=value-500000;
				val=va*30/100;
				valu=100000*10/100;
				v=250000*10/100;
				tax=v+val+valu;
				System.out.println("tax"+tax);
			}
	}
	
}