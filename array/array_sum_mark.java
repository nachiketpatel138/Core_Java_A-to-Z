import java.io.*;
class array
{
	public static void main(String[] args)
	{
		int sum=0;
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int arr[]=new int[value];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(con.readLine("enter the value "+(i+1)+"  "));	
		}
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
			 sum+=arr[i];
		}		
			System.out.println(sum);
	} 
}