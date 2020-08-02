import java.io.*;
class call
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine(" enter first choice\n 1.tax \n 2.call \n "));
		switch(value) 
		{
			case 1:
			tax();
			break;
			case 2:
			int valu=Integer.parseInt(con.readLine("enter the choice \n 1.pre \n 2.post \n"));
			     switch(valu)
			     {
			     	case 1:
			     		pre();
			     		break;
			     	case 2:
			     		post();
			     		break;
			     	default:
			     		System.out.println("invalid option");
				}
			break;
			default :
				System.out.println("invalid  option");
				
		}
	}
		public static void tax()
		{
			Console con=System.console();
	    	int value=Integer.parseInt(con.readLine("Enter a amount"));
			int tax=0;
			if(value<=100)
			{
				System.out.println("no tax");
			}
			else if(value>=101)
			{
				value=(value)*10/100;
			}
			System.out.println("Tax=  "+value);
		}
		public static void pre()
		{
			Console con=System.console();
	    	Double amount=Double.parseDouble(con.readLine("Enter a your balance"));
	    	if(amount<=100)
	    	{
	    	double	value=(amount) - (amount)*.40;
	    	System.out.println("your balance is" + value);
	    	}
	    	else if(amount<=200)
	    	{
	    		double	value=(amount) - (amount)*.35+40;
	    		System.out.println("your balance is" +value);
	    	}
	    	else if(amount<=350)
	    	{
	    		double	value=(amount) - (amount)*.30+110;
	    		System.out.println("your balance is" +value);
	    	}
	    	else if(amount>=350)
	    	{
	    		double	value=(amount) - (amount)*.25+215;
	    		System.out.println("your balance is" +value);
	    	}
		}
		public static void post()
		{
			Console con=System.console();
	    	Double amount=Double.parseDouble(con.readLine("Enter a your minute"));
	    	if(amount<=100)
	    	{
	    	double	value=500+(amount)*.35;
	    	System.out.println("your balance is" +value);
	    	}
	    	else if(amount<=200)
	    	{
	    		double	value=500+(amount)*.30+35;
	    		System.out.println("your balance is" +value);
	    	}
	    	else if(amount<=350)
	    	{
	    		double	value=500+ (amount)*.20+95;
	    		System.out.println("your balance is" +value);
	    	}
	    	else if(amount>=350)
	    	{
	    		double	value=500+(amount)*.15+165;
	    		System.out.println("your balance is" +value);
	    	}
}
}
