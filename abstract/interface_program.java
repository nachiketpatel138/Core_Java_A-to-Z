import java.io.*;
interface Item
{
	void read();
	void show();	
}
class book implements Item
{
	Console con=System.console();
	String name,author,publication;
	public void read()
	{
		name=con.readLine("enter the title of book");
		author=con.readLine("enter the author of book");
		publication=con.readLine("enter the publication of book");
	}
	public void show()
	{
		System.out.println("Book"+name+"author"+author+"publication"+publication);
	}

}
class dvd implements Item
{
	Console con=System.console();
	String name,director,category;
	public void read()
	{
		name=con.readLine("enter the title of movie");
		director=con.readLine("enter the director of movie");
		category=con.readLine("enter the category of movie");
	}
	public void show()
	{
		System.out.println("movie"+name+"director"+director+"category"+category);
	}

	
}
class main
{
	public static void main(String[] args)
	{
		Console con=System.console();
		Item i[]=new Item[2];
		
		for(int d=0;true;d++)
		{
			if(i.length==d)
			{
				for(int j=0;j!=i.length;j++)
					i[j].show();
					break;
			}				{
			String s=con.readLine("enter (b/d)");	
				if(s.equals("b"))
				{
					i[d]=new book();
					i[d].read();
				}
				else if(s.equals("d"))
				{
					i[d]=new dvd();
					i[d].read();
				}
			}
		}
	}
}
