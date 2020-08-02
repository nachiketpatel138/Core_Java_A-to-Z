interface X
{
  	void a();
	void b();
}
interface Y extends X
{
	void c();
	void d();
}
class Z implements Y
{
	public void a()
	{
		
	}
	public void b()
	{
	}
	public void c()
	{
	}
	public void d()
	{
	}
}