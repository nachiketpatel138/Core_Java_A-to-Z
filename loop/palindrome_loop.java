import java.io.*;
class number
{
	public static void main(String args[])
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the value"));
		int save=value;
		int re=0;
		while(value>0)
		{
		        int temp=value%10;
				value/=10;
				re=re*10+temp;
		}
		if(re==save)
			System.out.println("Palindrame");
		else
			System.out.println("NO");
	}
}