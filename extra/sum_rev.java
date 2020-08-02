import java.io.*;
class sum_rev
{
	public static void main(String args[])
	{
		int sum=0,rev=0;
		int num;
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		while(value>0)		
		{
			
				num=value%10;
				//System.out.println(num);
				rev=rev*10+num;
			//	System.out.println(rev);
	    	    value=value/10;	 	
	    	    	 sum+=num;
	    }		
	    	System.out.println(sum);
	    	System.out.println(rev);
	}
}