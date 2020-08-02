import java.io.*;
class design
{
	public static void main(String[] args)
		{
			int n=3,k;
				for(int i=0;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print("0");
						for(int j=1;j<=n;j++)
						{
							System.out.print("*");
								if(j!=n)
									for(k=1;k<=(n-i);k++)
										System.out.print("0");
						}
						for(int j=1;j<=i;j++)
							System.out.print("0");
								System.out.println();
			}
		}
}

