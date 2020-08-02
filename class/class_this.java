class thiskeyword
{
	public String name;
	public void setname(String name)
	{
		name=name;
		System.out.println(name);
		System.out.println(this.name);
	}
	public void setnamethis(String name)
	{
		this.name=name;
		System.out.println(name);
		System.out.println(this.name);
	}
	public void getname()
	{
		System.out.println(name);
	}
}
class thisclass
{
	public static void main(String[] args)
	{
		thiskeyword thisobj=new thiskeyword();
		System.out.println("not use");
		thisobj.setname("java");
		thisobj.getname();
		System.out.println(" use");
		thisobj.setnamethis("java");
		thisobj.getname();
	}
}