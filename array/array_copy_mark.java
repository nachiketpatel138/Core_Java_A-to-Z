import java.io.*;
class array
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int arr[]=new int[value];
		 int j[]=new int[value];
		for(int i=0;i<arr.length;i++)
		{
			System.out .println("enter the value "+(i+1)+" ");
			arr[i]=Integer.parseInt(con.readLine());
				j[i]=arr[i];
	       
	              
		} 
			for(int i=0;i<j.length;i++)
		{
			
			 System.out.println(j[i]);    
	              
		} 
		
}
}