import java.io.*
 class design
{
    public static void main(String[] args) 
    { 
        for (int i = 1; i <= 100; i++) 
        {
            int num = i;
             
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
                 
                num = num+rows-j;
            }
             
            System.out.println();
        }
         
        sc.close();
    }
