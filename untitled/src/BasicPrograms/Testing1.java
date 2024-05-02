package BasicPrograms;

import java.util.Scanner;
public class Testing1{
  public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();
  Testing2 obj=new Testing2();
  System.out.println(obj.isPalin(k));
  sc.close();
  }
}