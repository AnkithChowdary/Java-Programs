import java.util.ArrayList;
import java.util.Scanner;

public class LIstSwaping {
  public static void main(String []args){
    ArrayList<Integer>li=new ArrayList<>();
    System.out.println("Enter the number of elements: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0; i<n; i++)
      li.add(sc.nextInt());
    
      ArrayList<String>lst=new ArrayList<>();
      System.out.println("Array List of string:\nStart enter the strings:");
      lst.add(sc.next());
      lst.add(sc.next());
      System.out.println(lst);
    System.out.println(li);
  sc.close();

  }
}
