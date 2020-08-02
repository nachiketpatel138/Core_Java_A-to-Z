
class appuse
{
	public static void main(String[] args)
	{
		
		mobile m1=new mobile();
		mobile m2=new mobile();
		m1.setmname("mi");
		m1.setprice(10000);
		m2.setmname("sony");
		m1.setprice(12000);
		System.out.println("mname  ="+m1.getmname());
		System.out.println("price ="+m1.getprice());
		System.out.println();
		
	}
}
class mobile
{
	private String mname;
	private int price;
	public void setmname(String s)
	{
		mname=s;
	}
	public String getmname()
	{
		return mname;
	}
	public void setprice(int i)
	{
		price=i;
	}
	public int getprice()
	{
		return price;
	}
}
