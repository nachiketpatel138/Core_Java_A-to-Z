import java.io.*;
class design
{
	public static void main(String args[])
	{
		
		int p=0;
		for(int i=1,j=8;i<=8;)
		{
	
			int y=(p=(p*10) + i)*8 + i++;
			int k=(y*9)+ --j;
			System.out.println(k);
		}
	}
}