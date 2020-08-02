import java.io.*;
class InvalidSalaryException extends Exception
{
	InvalidSalaryException(String ms)
	{
		
		super(ms);
	}
}
class user
{
	public static void main(String[] args)
	{
		Console con=System.console();
		try
		{
			int salary=Integer.parseInt(con.readLine("enter the salary"));
			employee(salary);
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e);
		}
	}
		static void employee(int salary)throws InvalidSalaryException
		{
			try
			{
				if(salary>0 && salary<=10000)
					System.out.println("your salary is"+salary);	
				else
					throw new InvalidSalaryException("salary should be in the range");			
			}
			catch(InvalidSalaryException e)
			{
				System.out.println(e);
			}
			
		}
}
