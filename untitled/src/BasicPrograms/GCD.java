package BasicPrograms;

import java.util.*;

public class GCD {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num1,num2,gcd=1;
    num1=sc.nextInt();
    num2=sc.nextInt();
    for(int i=1; i<=num1&&i<=num2;i++){
      if(num1%i==0&&num2%i==0){
        gcd=i;
      }
    }
    System.out.println("The BasicPrograms.GCD of "+num1+" and "+num2+" is "+gcd);
    sc.close();
  }
}
