import java.io.*;
class number
{
	public static void main(String args[])
	{
		Console con=System.console();
		String str=con.readLine("Enter a String ");
		int j=str.length()-1;
		boolean boo=true;
		
		for(int i=0;i<=j;i++,j--)
			if(str.charAt(i)!=str.charAt(j))
			{
				boo=false;
				break;
			}
				
		if(boo)
			System.out.println("Palindrame");
		else
			System.out.println("NO");
	}
}