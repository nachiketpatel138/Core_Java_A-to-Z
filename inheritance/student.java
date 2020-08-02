import java.io.*;
class student
{
	private int Rollno;
	private String name;
	
	public void setRollno(int i)
	{
		Rollno=i;
	}
	public int getRollno()
	{
		return Rollno;
	}
	
	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}
	
	public int vm(int m,String s)
	{
		Console con=System.console();
		while(true)
		{
			if(m>=0 && m<=100)
			{
				return m;
			}
			else
			{
				m=Integer.parseInt(con.readLine("enter the "+s+" : "));
			}
		}
	}
	
	
	public char gr(int m)
	{
		char ch='F';
		if(m>80)
			ch='A';
			else if(m>60)
				ch='B';
				else if(m>40)
					ch='C';
					else if(m>32)
						ch='D';
						else
						ch='F';
						
						return ch;
	} 
}