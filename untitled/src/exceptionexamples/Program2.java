package exceptionexamples;

import java.util.*;
public class Program2 {
public static int randomNum(){
  return (int)(Math.random()*100);
}
 
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    try{
      int []arr=new int[100];
      for(int i=0; i<arr.length;i++){
        arr[i]=randomNum();
      }
       int s=sc.nextInt();     
        System.out.println(arr[s]);
    }catch(Exception e){
      throw new ArrayIndexOutOfBoundsException("Out of bounds");
    }

  }
  
}
