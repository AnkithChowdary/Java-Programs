import java.util.*;
package week2Skill;


abstract class Operation {
public abstract int perform(int a,int b);
  
}

class Addition extends Operation{
    public int perform(int a,int b){
      return a+b;
    }
}
class Substraction extends Operation{
  public int perform(int a,int b){
    return a-b;
  }
}
class Division extends Operation{
  public int perform(int a,int b){
    return a/b;
  }
}

class OperationFactory{
  public static Operation getOperation(String Op){
    switch(Op){
      case "+":
      return new Addition();
       break;

       case "-":
       return new Sub
    }
  }
}

public class Calculator{
  public static void main(String[] args) {
    System.out.println("HEllo world");
  }
  
}

