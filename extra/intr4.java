import java.io.*;
class d
{
	public static void main(String[] args)
	{
		int p=20,r=2,n=10;
     	 	int returnValue =test(p,r,n);
	 		System.out.println("returnValue"+returnValue);
	}
	public static int test(int p,int r,int n)
	{
	   int	i=p*r*n/100;
		return i;
	}
}