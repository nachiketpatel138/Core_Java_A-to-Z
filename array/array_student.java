import java.io.*;
class student
{
	public static void main(String[] args)
	{
		int top=-1;
		int to=-1;
		int t=-1;
		 Console con=System.console();
		 int value=Integer.parseInt(con.readLine("enter the number of student :"));
		 int roll[]=new int[value];
		 int mark[]=new int[value];
		 String name[]=new String[value];
		 int position[]=new int[value];
		 for(int i=0;i<value;i++)
		 {
		 	roll[++top]=Integer.parseInt(con.readLine("Enter Roll_no :"));
		 	mark[++to]=Integer.parseInt(con.readLine("Enter Mark    :"));
		 	name[++t]=(con.readLine("Enter Name    :"));
		 	System.out.println();
		 }
		 for(int j=0;j<value;j++)
		 {
		 	int i=j+1;
		 while(i<value)
		 {
		 	if(mark[j]<mark[i])
		 	{
		 		int temp=mark[j];
		 		mark[j]=mark[i];
		 		mark[i]=temp;
		 		
		 		String tem=name[j];
		 		name[j]=name[i];
		 		name[i]=tem;
		 		
		 		int te=roll[j];
		 		roll[j]=roll[i];
		 		roll[i]=te;
		 	}
		 		i++;
		 	}
		 }
		 System.out.println("roll_no" + "     name"+"      mark"+"    position");
		 System.out.println("----------------------------------------");
		 for(int i=0;i<value;i++)
		 {
		 	System.out.print("   "+roll[i]+"     |");
		 	System.out.print("    "+name[i]+"    |");
			System.out.print("   "+mark[i]+"    |");
			System.out.print("     "+(i+1)+"    |");
			System.out.println();
		 	
		 }
}
}