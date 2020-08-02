import java.io.*;
import java.lang.String;


class Student
{			

		private int id;
		private String name;
		
		public void setId(int id)
		{
			this.id = id;
		}
		public int getId()
		{
			return id;
			
		}
		public void setName(String name)
		{
			this.name= name;
		}
		public String getName()
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
					m=Integer.parseInt(con.readLine("Enter a "+s+" : "));
				}
			}
	}
	
			public char grade(int m)
			{
				char ch='F';
				
				if(m < 33)
				{
					ch='F';
				}
				else if(m < 40)
				{
					ch='D';
				}
				else if(m  < 60)
				{
					ch='C';
				}
				else if(m  < 80)
				{
					ch='B';
				}
				else if(m <= 100)
				{
					ch='A';
				}
				return ch;
			}
			
			
}

