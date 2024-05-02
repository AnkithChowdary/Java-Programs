package BasicPrograms;

import java.util.*;
public class PrimeNumber {
  public static void main(String []args){
    
    // This code is checking whether a given number `x` is a prime number or not.
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int flag=0;
    if(x==0||x==1){
      System.out.println("It is not a Prime Number");
    }else{
      for(int i=2; i<=x/2;i++){
        if(x%i==0){      
          System.out.println(x+" is not prime number");      
          flag=1;      
          break;      
         }     
      }
      if(flag==0)
      System.out.println(x+" is a prime number");
    }
    sc.close();
  }
}
