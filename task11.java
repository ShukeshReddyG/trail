import java.util.Scanner;
import java.lang.Exception;
class task11
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
try {
int a,b,c;



System.out.println("ENTER A:");
a= input.nextInt();
System.out.println("ENTER B:");
b= input.nextInt();
c= (a/b);
System.out.println("Result"+c);

}
catch(ArithmeticException e)
{
System.out.println("INVALID INPUT");
}
}
}
