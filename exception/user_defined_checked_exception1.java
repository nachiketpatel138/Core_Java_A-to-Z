import java.io.*;
class InvalidIdException extends Exception
{
	InvalidIdException(String msg)
	{
		super(msg);
	}
}
class app
{
	private int id;
	public void setId(int i)throws InvalidIdException
	{
		if(i>0)
			id=i;
		else 
		{
			InvalidIdException e=new InvalidIdException("enter invalid Id");
			throw e;
		}
	}	
			public int getId()
			{
				return id;
			}
}
class appuse
{
	public static void main(String[] args)
	{
		app appob=new app();
		try
		{
			appob.setId(-11);
		}
		catch(InvalidIdException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
