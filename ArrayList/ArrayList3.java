import java.io.*;
import java.util.ArrayList;
class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList<student> al=new ArrayList<student>();
		
		al.add(new student());
		al.add(new student());
		
		System.out.println(al.get(0).getname());
		
		al.get(0).setname("N");
		
		System.out.println(al.get(0).getname());
	
	}
}