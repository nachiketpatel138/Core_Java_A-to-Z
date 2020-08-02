import java.io.*;
class matrix
{
	public int a[][]=new int[3][3];
	public void input()
	{
		Console con=System.console();
		System.out.println("enter the value");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("value ["+i+"]["+j+"]");
				a[i][j]=Integer.parseInt(con.readLine());
			}
		}
	}
	public void show()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("["+i+"]["+j+"]"+a[i][j]+"");
			}
			System.out.println();
		}
	}
}
class matrixsize
{
	public static void main(String[] args)
	{
		matrix matrix=new matrix();
		matrix.input();
		matrix.show();
		
		matrix matrix1=new matrix();
		matrix.input();
		matrix.show();
	}
}