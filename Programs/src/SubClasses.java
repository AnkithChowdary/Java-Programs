class OuterClass{
    public void display1(){
      System.out.println("In Outer class");
    }
 
  class InnerClass{
     public void display(){
      System.out.println("Inner class");
     }
  }
  static class AnotherInnerClass{
    public void display2(){
      System.out.println("AnotherInner classn which is static");
    }
  }
}


public class SubClasses {
  public static void main(String[] args) {
    OuterClass obj=new OuterClass();
    obj.display1();

    OuterClass.InnerClass obj1=obj.new InnerClass();
    obj1.display();

    OuterClass.AnotherInnerClass obj2=new OuterClass.AnotherInnerClass();
    obj2.display2();
  }
}
