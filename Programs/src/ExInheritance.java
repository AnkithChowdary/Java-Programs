import java.util.*;
class A extends B{
  public void display(){
  System.out.println("In A");
  }
  public int add(int a, int b){
return a+b;
  }
}
class B{
  public void display(){
  System.out.println("In B");
  }


}
public class ExInheritance {
  
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    A obj=new A();
    obj.display();
     int a=sc.nextInt();
     int b=sc.nextInt();
    int result=obj.add(a,b);
    System.out.println(result);



  }
}
