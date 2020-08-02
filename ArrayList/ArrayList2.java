import java.io.*;
import java.util.ArrayList;
class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList<student> al=new ArrayList<student>();
		
		al.add(new student(101,"A"));
		al.add(new student(102,"B"));
		
		System.out.println(al.get(0).getname());
	
	}
}