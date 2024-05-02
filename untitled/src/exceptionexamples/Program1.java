package exceptionexamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    try{
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(a+b);
    }catch(Exception e){
      throw new InputMismatchException("Enter the number again");
    }
  }
}
