import java.io.*;
class loop
{
	public static void main(String args[])
	{
		Console con=System.console();
		Integer value=Integer.parseInt(con.readLine("enter the number"));
	int p=value%10;
	int	a=value/10;
		int i=1,sum=(p==0)?a:0;
			while(i<=p)
			{
				 	
				 	if(i==1)
				 	{
				 		sum+=a;
				 		
				 	} 	
				 	else
				 		{
				 		sum*=a;
				 		
				 		}
				 		
				 		i++;
				 		if(i>p)
				 			System.out.print(a +"=");
				 		else
				 			System.out.print(a +"*");
			}
			System.out.println(sum);   
	}
}