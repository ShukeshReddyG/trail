import java.util.Scanner;
import java.lang.*;
class TestClass {
    public static void main(String args[] )  {
       Scanner input = new Scanner(System.in);
       try

       {
           int g,h,j;
           g=input.nextInt();
           h=input.nextInt();
           j=(g/h);
           System.out.println(j);

       }
       catch(ArithmeticException e)
       {
       System.out.println("Input Mismatch");
       }

    }
}