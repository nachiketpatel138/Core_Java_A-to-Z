import java.io.*;
Class sup
{
   public void mA()
   {
     System.out.println("Base class method");
   }
}
Class sub extends Sup
{
   public void mB()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
     sub ob = new sub();
     ob.mA(); //calling super class method
     ob.mB(); //calling local method
  }
}