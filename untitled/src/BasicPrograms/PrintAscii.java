package BasicPrograms; /**
 * The BasicPrograms.PrintAscii class reads a character from the user and prints its ASCII value.
 */
import java.util.Scanner;

public class PrintAscii {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    Character ch=sc.next().charAt(0);
    int k=ch;
    System.out.println(k);
    sc.close();
  }
}
