import java.io.*;
class string
{
	public static void main(String[] args)
	{
		
		StringBuilder sb3=new StringBuilder();
		sb3.ensureCapacity(15);
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(17);
		System.out.println(sb3.capacity());
		//35---35
	}
}