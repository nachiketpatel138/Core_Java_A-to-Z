import java.io.*;
class tax
	
{
public static void main(String args[])
{
	Console con=System.console();
		int amount=Integer.parseInt(con.readLine("amount is\t"));
	//	System.out.println("amount is "+amount);
		int rate=Integer.parseInt(con.readLine("rate is\t"));
	//	System.out.println("rate is "           +rate);
	    int time=Integer.parseInt(con.readLine("time is\t"));
//	System.out.println("time is"                +time);
	System.out.println("--------------------------------------");
	int i=amount*rate*time/100;
		System.out.println("your intress is "   +i);

		
		
		
		int ir=Integer.parseInt(con.readLine("ir is \t"));
		int	dep=ir*30/100;
			System.out.println("dep is"+dep);
}
}
	
