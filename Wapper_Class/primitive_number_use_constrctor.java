import java.io.*;
class Convert
{
	public static void main(String[] args)
	{
		System.out.println("Converting primitive number to object using constructors");
		
		byte b=10;
		Byte bObj=new Byte(b);
		System.out.println(bObj);
		
		Short s=20;
		Short sObj=new Short(s);
		System.out.println(sObj);
		
		Integer i=30;
		Integer iObj=new Integer(i);
		System.out.println(iObj);
		
		Long l=40l;
		Long lObj=new Long(l);
		System.out.println(lObj);
		
		Float f=50.23f;
		Float fObj=new Float(f);
		System.out.println(fObj);
		
		Double d=50.235565;
		Double dObj=new Double(d);
		System.out.println(dObj);
		
		System.out.println("Converting object to primitive numbers using method");
		byte b1=bObj.byteValue();
		short s1=sObj.shortValue();
		int i1=iObj.intValue();
		long l1=lObj.longValue();
		float f1=fObj.floatValue();
		double d1=dObj.doubleValue();
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		
	}
}