class OuterClass{
    
  public void display1(){
       System.out.println("Outer class");
  }
  class InnerClass{
     public void display(){
      System.out.println("Inner class");
     }
  }
}


public class SubClasses {
  public static void main(String[] args) {
    OuterClass obj=new OuterClass();
    obj.display1();

    OuterClass.InnerClass obj1=obj.new InnerClass();
    obj1.display();
  }
}
