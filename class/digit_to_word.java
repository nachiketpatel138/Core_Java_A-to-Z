import java.io.*;
class sum
{
	public static void main(String args[])
	{
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the number"));
		int sum=0;
			while(value>0)
			{
				
				int temp=value%10;
				
			
				
				value=value/10;
				if(temp!=0)
					System.out.println(temp);
				else
					System.out.println(temp);
						if(temp==1)
						
	                    	System.out.println("one");
	                    
	                    if (temp==2)
	                    
							System.out.println("two");
							
								if (temp==3)
								System.out.println("three");
				if (temp==4)
			System.out.println("four");
				if (temp==5)
			System.out.println("five");
				if (temp==6)
			System.out.println("six");
				if (temp==7)
			System.out.println("seven");
				if (temp==8)
			System.out.println("eight");
				if (temp==9)
			System.out.println("nine");
				if (temp==0)
			System.out.println("zero");
	                   
				
			}
		
	}
}