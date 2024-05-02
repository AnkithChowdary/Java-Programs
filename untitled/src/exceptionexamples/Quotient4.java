package exceptionexamples;

public class Quotient4 {
  public static void main(String[] args) {
    try{
      int n1=2;
      int n2=0;
      System.out.println(n1/n2);
    }catch(ArithmeticException e){
      System.out.println("Can't divide it by zero");
    }
  }
}
