import java.io.*;
class animal
{
	public void sound()
	{
	}
}
class dog extends animal
{
	public void sound()
	{
		System.out.println("meovu....");
	}
}
class cat extends animal
{
	public void sound()
	{
		System.out.println("meovu....");
	}
}
class cow extends animal
{
	public void sound()
	{
		System.out.println("bhhhhh....");
	}
}

class runtimepolymorphism
{
	public static void main(String[] args)
	{
		cat b=new cat();
		cow c=new cow();
		animal ao[]=new animal[3];
		ao[0]=new dog();
		ao[1]=b;
		ao[2]=c;
		for(int i=0;i<ao.length;i++)
		ao[i].sound();
		
	}
}