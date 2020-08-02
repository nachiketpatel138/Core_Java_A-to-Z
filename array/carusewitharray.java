import java.io.*;
class caruse
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int value=Integer.parseInt(con.readLine("enter the number"));
		car ob[]=new car[value];
		for(int i=0;i<ob.length;i++)
		{
			ob[i]=new car();
			ob[i].setcname(con.readLine("enter the name "));
			ob[i].setprice(Integer.parseInt(con.readLine("enter the price")));
			ob[i].setaverage(Integer.parseInt(con.readLine("enter the average ")));
		}
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i].getcname());
			System.out.println(ob[i].getprice());
			System.out.println(ob[i].getaverage());
			System.out.println();
		}
	}
}