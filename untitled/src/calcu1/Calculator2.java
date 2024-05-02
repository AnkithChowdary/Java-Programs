package calcu1;
import java.util.Scanner;
import calcu.Mycalculator1;


public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        System.out.println(Mycalculator1.add(a1,b1));
        System.out.println(Mycalculator1.sub(a1,b1));
        System.out.println(Mycalculator1.multi(a1,b1));
        System.out.println(Mycalculator1.divi(a1,b1));
    }

}
