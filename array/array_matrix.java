import java.io.*;
class array
{
	public static void main(String[] args)
	{
		
		int tda[][]={{1,2,3,4,5,6},{7,8,9}};
		int tdb[][]={{1,2,3},{4,5,6},{7,8,9}};
		int tdc[][]=new int[tda.length][tda.length];
		
		for(int i=0;i<tdc.length;i++)
		{
			for(int j=0;j<tdc[i].length;j++)
			{
				 tdc[i][j]=tda[i][j]+tdb[i][j]	;
			}
		}
		System.out.println("A\t+\tB =\tC");
		System.out.println();
		for(int i=0;i<tdc.length;i++)
		{
			for(int j=0;j<tdc[i].length;j++)
			{
         		System.out.print(tda[i][j]+"\t+\t");
         		System.out.print(tdb[i][j]+" =\t");
         		System.out.println(tdc[i][j]);	
			}
		}
}
}