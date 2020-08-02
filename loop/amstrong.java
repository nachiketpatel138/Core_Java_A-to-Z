import java.io.*;
class am
{
	public static void main(String[] args)
	{
		int value=207;
		while(value>0)
		{
		
		int temp=value%10;
		value/=10;
		System.out.println(temp);
	//	System.out.println(value);
		}
	}
}