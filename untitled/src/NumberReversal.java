import java.util.*;
public class NumberReversal {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int s=0;
    while(k!=0){
    s=s*10+k%10;
    k/=10;
    }
    System.out.println("The Number after the reversing:"+s);
    sc.close();
  }
}
