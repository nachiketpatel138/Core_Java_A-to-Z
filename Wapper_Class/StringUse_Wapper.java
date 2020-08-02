import java.io.*;
class UsingToStrong
{
	public static void main(String[] args)
	{
		byte b=123;
		String str=Byte.toString(b);
		System.out.println(str);
		
		Byte bObj=new Byte(b);
		str=bObj.toString();
		System.out.println(str);
		System.out.println();
		//SIZE  OF WAPPERCLASS
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		//MIN VALUE OR MAX VALUE WAPPER CLASS
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}
}