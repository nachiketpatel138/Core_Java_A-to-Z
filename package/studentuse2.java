class studentuse2 extends PackageName.SubPackage.student
{
	public static void main(String[] args)
	{
		studentuse2 obj=new studentuse2();
		obj.main();
	}
	public void main()
	{
	
		setId(101);
		System.out.println(getId());
		
		setname("NAME");
		System.out.println(getname());
	}
}