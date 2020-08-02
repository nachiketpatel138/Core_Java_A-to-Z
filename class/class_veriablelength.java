import java.io.*;
class sumclass
{
	public int summethod(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args)//String...
	{
		sumclass so=new sumclass();
		int sum=so.summethod(15,15);
		System.out.println("sum two argument "+sum);
		
		sum=so.summethod();
		System.out.println("sum zero argument"+sum);
		
		sum=so.summethod(15,15,20);
		System.out.println("sum zero argument"+sum);
		
			sum=so.summethod(15,15,20,24);
		System.out.println("sum zero argument"+sum);
		
	}
}