package exceptionexamples;

public class  ThrowsEx{
  public static void main(String []args){
    int v=10;
    try{
      if(v<30){
        throw new ArithmeticException("Too small value");
      }
    }
       catch (Exception e) {
        System.out.println(e.getMessage());
      }
    
  }
}