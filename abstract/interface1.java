interface X
{
  	void a();
	void b();
	void s();
}
interface Y extends X
{
	void c();
	void d();
	void s();
}
interface Z extends X,Y
{
	void e();
	void f();
	void s();
}
class A implements Z
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
	public void e()
	{
	}
	public void f()
	{
	}
	public void s()
	{
	}		
}