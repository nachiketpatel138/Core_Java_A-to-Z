import PackageName.SubPackage.student;
import static PackageName.SubPackage.student.nos;
class studentuse3
{
	public static void main(String[] args)
	{
		student so=new student();
		so.setId(101);
		System.out.println(so.getId());
		
		so.setname("NAME");
		System.out.println(so.getname());
		
		
		System.out.println(nos);
	}
}