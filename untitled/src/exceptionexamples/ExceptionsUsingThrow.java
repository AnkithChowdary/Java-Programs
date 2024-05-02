package exceptionexamples;

public class ExceptionsUsingThrow {
  public static void checker(int age){
    if(age<18){
      throw new ArithmeticException("Not eligible");
    }else{
      System.out.println("Eligible");
    }
  }
  public static void main(String[] args) {
    checker(13);
    checker(20);
  }
}
