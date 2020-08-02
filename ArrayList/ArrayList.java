import java.io.*;
import java.util.ArrayList;
class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("1");
		al.add("B");
		al.add("2");
		al.add("D");
		al.add("E");
		al.add("D");
		System.out.println("Element in Array list        "+al);
		al.add(3,"C");
		System.out.println("Element INSERT in arraylist  "+al);
		al.remove(1);
		System.out.println("Element REMOVE in arraylist  "+al);
		al.remove(2);
		System.out.println("Element REMOVE in arraylist  "+al);
		
		System.out.println("Element SIZE in arraylist    "+al.size());
		System.out.println("Element CONTAINS in arraylist --"+al.contains("A"));
		System.out.println("Element CONTAINS in arraylist --"+al.contains("1"));
		System.out.println("");
		System.out.println("Element CONTAINS in arraylist  "+al.get(3));
		System.out.println("");
		System.out.println("Element INDEXOF in arraylist   "+al.indexOf("D"));
		System.out.println("Element last INDEXOF in arraylist "+al.lastIndexOf("D"));
		System.out.println("Element MODIFY in arraylist "+al.set(5,"F"));
		System.out.println("Element in arraylist "+al);
		
		System.out.println();
		ArrayList al2=(ArrayList)al.clone();
		System.out.println("Element in Arraylist "+al.isEmpty());
		al.clear();
		System.out.println("Element CLEAR in arraylist "+al.isEmpty());
		System.out.println(""+al2);
	}
