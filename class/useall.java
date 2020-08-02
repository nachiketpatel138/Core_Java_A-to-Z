class appuse
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		
		System.out.println("ID "+s1.getID());
		System.out.println("Name "+s1.getName());
		
		s1.setID(101);
		s1.setName("abc");
		
		System.out.println("ID "+s1.getID());
		System.out.println("Name "+s1.getName());
		System.out.println();
		mobile m1=new mobile();
		mobile m2=new mobile();
		m1.setmname("mi");
		m1.setprice(10000);
		m2.setmname("sony");
		m1.setprice(12000);
		System.out.println("mname  ="+m1.getmname());
		System.out.println("price ="+m1.getprice());
		System.out.println();
		car c1=new car();
		c1.setcname("swift");
		c1.setprice(5000000);
		c1.setaverage(24);
		System.out.println("carname ="+c1.getcname());
		System.out.println("price ="+c1.getprice());
		System.out.println("average ="+c1.getaverage());
	}
}