import java.io.*;
class prime
{
public static void main(int n) 
{

    int i = 2;
    while (i <= (n - 1)) {
        if (n % i == 0) {
            System.out.println("It's not a prime number");
            break;
        } else {
            System.out.println("It's a prime number");
            break;
        }
        i++;
    }
}
}