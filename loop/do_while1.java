import java.io.*;
class breaak
{
	public static void main(String args[])
	{
    	int i=1,j=1;
        do
       {
       		System.out.println("j="+j);
       		if(i==5)
				 break;
			System.out.println("\ti="+i);
				i++;
				j++;
       }
		while(i<=10);		
		System.out.println("bye");
	}
	
}