import java.io.*;
import java.util.*;
class vector
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("java");
		v.add("javac");
		v.add(new Long(900));
		v.add(new String("newjava"));
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.indexOf("Nachiket"));
		System.out.println(v.get(1));
		Object str=v.get(2);
		System.out.println(str);
	
		Iterator obj=v.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
			System.out.println("----------");
		}	
		ListIterator obj1=v.listIterator();
		while(obj1.hasNext())
			System.out.println(obj1.next());
		}
}