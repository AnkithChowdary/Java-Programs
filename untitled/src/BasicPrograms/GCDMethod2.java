package BasicPrograms;

import java.util.Scanner;

public class GCDMethod2 {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    num1=sc.nextInt();
    num2=sc.nextInt();
    while(num1!=num2){
    if(num1>num2){
    num1=num1-num2;
    }
    else{
    num2=num2-num1;
  
    }
  }
    System.out.println("The BasicPrograms.GCD of "+num1+" and "+num2+" is "+num2);
    sc.close();
  }
}
