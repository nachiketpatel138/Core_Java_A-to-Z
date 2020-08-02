import java.io.*;
class math
{
	public static void main(String[] args)
	{
		int a,b,c,d,max,main=0;
		a=(int)(Math.random()*10000);
		b=(int)(Math.random()*1000);
		c=(int)(Math.random()*100);
        d=(int)(Math.random()*10);
        
        	System.out.println("A="+a+" B="+b+" C="+c+" D="+d);
        	System.out.println(a+b);
        	System.out.println("Abs ="+Math.abs(-10));		//always positive value
        	System.out.println("ceil ="+Math.ceil(10.9));
        	System.out.println("floor ="+Math.floor(10.9));
        	System.out.println("pow ="+Math.pow(2,3));
        	System.out.println("Sin ="+Math.sin(1));
        	System.out.println("Cos ="+Math.cos(1));
        	System.out.println("Tan ="+Math.tan(1));
        	System.out.println("max ="+Math.max(23,52));
        	System.out.println("Min ="+Math.min(1,5));
        	System.out.println("Sqrt ="+Math.sqrt(81));
        	System.out.println("log ="+Math.log(1));         //log value
        	System.out.println("Exp ="+Math.exp(2));
        	System.out.println("Round ="+Math.round(5.7));   //newrset integer value
        	System.out.println("Radians ="+Math.toRadians(4));
        	System.out.println("Degrees ="+Math.toDegrees(4));     	
	}
}