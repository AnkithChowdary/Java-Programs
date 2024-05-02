package BasicPrograms;

import java.util.*;
public class ArmstrongNumber {
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();
  int digits=(int)Math.log10(k)+1;
  int org=k,sum=0;
  while(org!=0){
    int r=org%10;
    sum+=Math.pow(r,digits);
    org/=10;
  }
  if(sum==k)
  System.out.println("It is a BasicPrograms.ArmstrongNumber");
  else
  System.out.println("It is not a BasicPrograms.ArmstrongNumber");
  sc.close();
}
}
