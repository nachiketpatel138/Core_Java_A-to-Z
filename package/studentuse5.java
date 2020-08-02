import localp.*;
import outside.*;
class studentuse5
{
	public static void main(String[] args)
	{
		localp.student so=new localp.student();
		so.setId(101);
		System.out.println(so.getId());
		
		so.setname("NAME");
		System.out.println(so.getname());
	}
}