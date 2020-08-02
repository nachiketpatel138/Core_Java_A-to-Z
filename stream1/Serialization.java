import java.io.*;
class Student implements Serializable
{
	private int id;
	private String name;
	transient private String password;
	public Student(int id,String name,String password)
	{
		this.id=id;
		this.name=name;
		this.password=password;
	}
	public void show()
	{
		System.out.println("ID       "+id);
		System.out.println("Name     "+name);
		System.out.println("Password "+password);
	}
}
class serializationDemo
{
	public static void main(String[] args)throws IOException,ClassNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("object.dat");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Student s1=new Student(101,"aa","aaa");
		oos.writeObject(s1);
		
		Student s2=new Student(102,"bb","bbb");
		oos.writeObject(s2);
		oos.close();
		
		FileInputStream fis=new FileInputStream("object.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student obj;
		obj=(Student)ois.readObject();
		obj.show();
		obj=(Student)ois.readObject();
		obj.show();
		ois.close();
		
	}
		
}