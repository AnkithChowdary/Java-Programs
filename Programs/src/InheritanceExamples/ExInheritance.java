package InheritanceExamples;
import java.util.*;
class A extends B{
  public void display(){
  System.out.println("In A");
  }
  public int add(int a, int b){
return a+b;
  }
  public int power(int a,int n){
    return (int)Math.pow(a, n)+1;
  }
}
class B{
  
  public int power(int a,int n){                 
    return (int)Math.pow(a,n);
  }
 
}
public class ExInheritance {
  
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    A obj=new A();
    obj.display();
    System.out.print("Enter the values for a and b:");
     int a=sc.nextInt();
     int b=sc.nextInt();
    int result=obj.add(a,b);
    System.out.println("The addition is:"+result);

    int n=sc.nextInt();
    int p=sc.nextInt();
    int ans=obj.power(n,p);
    System.out.println(ans);

    
   sc.close();


  }
}
