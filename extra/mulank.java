import java.io.*;
class mul
{
	public static void main(String[] args)
	{
	Console con=System.console();
	int value=Integer.parseInt(con.readLine("Enter your birth date"));
	int temp=value%10;
	value/=10;
	int sum=temp+value;
	if(sum>=9)
	{
		int my=sum%10;
		sum/=10;
		sum+=my;
		System.out.println("Your answer   "+sum);
	}
	else
	{
	System.out.println("Your answer   "+sum);
	}
	}
}