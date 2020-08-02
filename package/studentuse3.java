import localp.student;
import outside.student;
class studentuse
{
	public static void main(String[] args)
	{
		student so=new student();
		so.setId(101);
		System.out.println(so.getId());
		
		so.setname("NAME");
		System.out.println(so.getname());
	}
}