import java.util.*;  
class TestJavaCollection1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
Scanner input= new Scanner(System.in);
String name="";
name= input.nextLine();
System.out.println(" name:"); 
list.add(name);//Adding object in arraylist  
list.add("Vijay");  
list.add("Ravi");  
list.add("Ajay");  
//Traversing list through Iterator  
Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  