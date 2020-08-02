import java.io.*;
class appuse
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
			ob[i].settype(con.readLine("enter the car fual "));
		}
		String valu=(con.readLine("enter the fual type"));
		for(int j=0;j<ob.length;j++)
		{	
		if(valu.equals(ob[j].gettype()))
			{
					System.out.println(ob[j].getcname());
					System.out.println(ob[j].getprice());
					System.out.println(ob[j].getaverage());
					System.out.println(ob[j].gettype());
					System.out.println();
			}
		
		}
		}
			
	}

class car
{
	private String cname;
	private int price;
	private int average;
	private String type;
	public void setcname(String s)
	{
		cname=s;
	}
	public String getcname()
	{
		return cname;
	}
		public void setprice(int i)
	{
		price=i;
	}
	public int getprice()
	{
		return price;
	}
	public void setaverage(int a)
	{
		average=a;
	}
	public int getaverage()
	{
		return average;
	}
	public void settype(String t)
	{
		type=t;
	}
	public String gettype()
	{
		return type;
	}
}
