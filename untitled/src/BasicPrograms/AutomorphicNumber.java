package BasicPrograms;

import java.util.*;
public class AutomorphicNumber {

  static boolean automorphic(int num,int s){
   
    while(num>0){
      if(num%10!=s%10)
      return false;
      num/=10;
      s/=10;
    }
    return true;
  }
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int s=(int)Math.pow(num,2);
    System.out.println(automorphic(num,s)?"It is automorphic Number":"It is not a Automorphic Number");
    sc.close();
  }
}
