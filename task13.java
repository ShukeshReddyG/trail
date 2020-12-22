import java.util.*;  
class task13{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();
Scanner input= new Scanner(System.in);
String name="";
String id="";
String dob;
System.out.println("ENTER STUDENT NAME:"); 
name= input.nextLine();
list.add(name);
System.out.println("ENTER ID:"); 
id= input.nextLine();
list.add(id);
System.out.println("ENTER FATHER NAME:"); 
name= input.nextLine();
list.add(name);
System.out.println("ENTER FATHER DOB:"); 
dob= input.nextLine();
list.add(dob);

Iterator itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
