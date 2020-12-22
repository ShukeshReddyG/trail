import java.util.*;
class task extends Thread

{

public void run()

{

Scanner s= new Scanner(System.in);
int n=5;
String str= s.nextLine();
String str1="START";
boolean r1= str1.equals(str);
if(r1)
{
for(int i = 1;i<=n;i++)
{

System.out.println(i);

}


}




}





}

}








class swetha
{

public static void main(String args[])
{
task s1 =new task();
s1.start();
}


}