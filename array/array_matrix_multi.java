import java.io.*;
class array
{
	public static void main(String[] args)
	{
		
		int tda[][]={{1,2,3},{4,5,6},{7,8,9}};
		int tdb[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<tda.length;i++)
		{
			for(int j=0;j<tda[i].length;j++)
			{
				int power=1;
				for(int k=i+1;k<=tda[i][j];k++)
				{
				 power*=tda[i][j];
				}
				tda[i][j]=power;
			}
		}
		for(int i=0;i<tda.length;i++)
		{
			for(int j=0;j<tda[i].length;j++)
			{
         		System.out.println(tda[i][j]);
			}
		}
}
}