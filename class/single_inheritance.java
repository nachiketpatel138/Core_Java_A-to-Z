import java.io.*;
class sup
{
   public void mA()
   {
     System.out.println("Base class method");
   }
}
class sub extends sup
{
   public void mB()
   {
     System.out.println("Child class method");
   }
  
   public static void main(String args[])
   {
     sub ob = new sub();
     ob.mA(); 
     ob.mB(); 
  }
}