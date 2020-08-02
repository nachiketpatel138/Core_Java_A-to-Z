import java.io.*;
class count
{
	public static void main(String args[])
	{
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the value"));
	
		int op1,op2,op3,op4;
		op1=op2=op3=op4=0;
	
		for(op1++;op2++<value;op4++)
		{		
			op3++; 
		}
		System.out.println("op 1 "+op1);
		System.out.println("op 2 "+op2);
		System.out.println("op 3 "+op3);
		System.out.println("op 4 "+op4);
	}
}