import java.io.*;
class array
{
	public static void main(String[] args)
	{
		Console con=System.console();
		int td[][]=new int[2][2];
		for(int i=0;i<td.length;i++)
		{
			for(int j=0;j<td[i].length;j++)
			{
				td[i][j]=Integer.parseInt(con.readLine("enter the value["+i+"]["+j+"]: "));
			}
		}
		for(int i=0;i<td.length;i++)
		{
			for(int j=0;j<td.length;j++)
			{
				System.out.print(" "+td[i][j]+" ");
			}
		}
	}
}