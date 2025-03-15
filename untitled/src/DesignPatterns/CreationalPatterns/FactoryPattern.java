import java.util.*;
interface Calculator{
  void add(int a, int b);
  void sub(int a,int b);
}

class Addition implements Calculator{
  public void add(int a,int b) {
   System.out.println(a+b);
  }
  public void sub(int a,int b){
   System.out.println("Cannot perform sub");
  }
}

class Substraction implements Calculator{
  public void add(int a,int b){
    System.out.println("Cannot perform addition");
  }

  public void sub(int a,int  b){
    System.out.println("Sub:"+(a-b));
  }
}

class CalculatorFactory{
  public Calculator getInstanceCalculator(String type){
    if(type.equalsIgnoreCase("Add")){
      return new Addition();
    }
    else if(type.equalsIgnoreCase("Sub")){
      return new Substraction();
    }else{
      return null;
    }
  }
}


public class FactoryPattern {
  public static void main(String[] args) {
    CalculatorFactory cf=new CalculatorFactory();
    System.out.println("");
    String choice="";
    Scanner sc=new Scanner(System.in);
    choice=sc.next();
    Calculator c=cf.getInstanceCalculator(choice);
    if(c!=null){
      c.add(5, 4);
      c.sub(4,1);
    }else{
     System.out.println("Invalid choice");
    }
    sc.close();
  }
}
