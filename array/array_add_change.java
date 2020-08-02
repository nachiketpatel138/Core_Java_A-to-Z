import java.io.*;
class power
{
	//main mathod out side static
	static	int	a[]=new int[10];
	static int b[]=new int[10];
	static int temp[]=new int[10];
	static int top=-1;	
	static Console con=System.console();
	public static void main(String[] args)
	{	
		while(true)
		{
		System.out.println("(1) add");
		System.out.println("(2) modify");
		System.out.println("(3) display");
		System.out.println("(4) swap");
		System.out.println("(5) delete");
		System.out.println("(6) exit");
		System.out.println("(7) search");
		int value=Integer.parseInt(con.readLine("enter the number of choice"));
		switch(value)
		{
			case 1:
				add();
				break;
			case 2:
				modify();
				break;	
			case 3:
				display();
				break;	
			case 4:
				swap();
				break;
			case 5:
				delete();
				break;	
			case 6:
				System.out.println("thanks");
				break;
			case 7:
				search();
				break;		
			}
			
			if(value==6)
				break;
		}
	}
	public static void add()
	{
		if(top>8)
		{
			System.out.println("array em");
		}
		else
		{
			a[++top]=Integer.parseInt(con.readLine("enter a value"));
		}
	}
	public static void modify()
	{
		int ip=Integer.parseInt(con.readLine("enter the index  "));	
		while(ip<=top)
		{
			a[ip]=Integer.parseInt(con.readLine("enter a value"));
		
		for(int i=0;ip<10;i++,ip++)
		{
				b[ip]=a[ip];
		}
		}
	}
	public static void display()
	{
		System.out.println();
		for(int i=0;i<=top;i++)
			System.out.print(a[i]+" ");
			System.out.println();
			if(top==-1)
			{
				System.out.println("\n error ");
			}
	}
	public static void delete()
	{
		int ip=Integer.parseInt(con.readLine("enter the index  "));	
		if(top>=ip)
		{
			for(;ip<=top-1;ip++)
			{
				a[ip]=a[ip+1];	
			}
			top--;
		}
		else
		{
			System.out.println("\n error !!!!");
		}
	}
	public static void swap()
	{
		int ip=Integer.parseInt(con.readLine("enter the index"));
		if(top>=ip)
		{
			int value=Integer.parseInt(con.readLine("enter the Value  "));	
			for(int i=top+1;i>ip;i--)
			{
				a[i]=a[i-1];
			}
			a[ip]=value;
			top++;
		}
		else
		{
			System.out.println("\n error !!!!");	
		}
	}
	public static void search()
	{
		int number=Integer.parseInt(con.readLine("enter the search value"));
		int k=0;
		int m=0;
		
		System.out.println(" IP ");
		for(int i=0;i<=top;i++)
		{	
			if(a[i]==number)
			{
				k=a[i];
				m+=1;
				System.out.println(i);
			}
		}
		
			if(k==number)
			{
				System.out.println(m+" times ");
			}
			else
			{
				System.out.println("not found");
			}
		
	}
	
}
