import java.util.Scanner;

public class Factorial {
  static int factorial(int num){
  if(num==1)
  return 1;
  int c=num*factorial(num-1);
  return c;
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=factorial(n);
    System.out.println("The Factorial of "+n+" is "+k);
     sc.close();
  }
}
