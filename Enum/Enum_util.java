import java.util.*;
enum Course
{
	Java("Gopal sir",7000),
	ORE("XXX",4000),
	CPP("TTT",5000),
	PHP("XYZ",5000);
	
		private final String faculty;
		private final int fee;
		
		Course(String name,int amount)
		{
			faculty=name;
			fee=amount;
		}
		public String getfmname()
		{
			return faculty;
		}
		public int getfee()
		{
			return fee;
		}
}
class admission
{
	public static void main(String[] args)
	{
		System.out.println("All");
		for(Course cs:Course.values())
		{
			System.out.println(cs.getfmname()+"  "+cs.getfee());
		}
		System.out.println("range");
		for(Course cs:EnumSet.range(Course.ORE,Course.PHP))
		{
			System.out.println(cs.getfmname()+"  "+cs.getfee());
		}
	}
}
		
