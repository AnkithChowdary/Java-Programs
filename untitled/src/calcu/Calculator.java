package calcu;
import java.util.Scanner;
class MyCalculator{
    public static int sub(int n1,int n2) {
        return (n1 - n2);
    }
    public static int add(int n1,int n2) {
        return (n1 + n2);
    }
    public static int multi(int n1,int n2) {
        return n1 * n2;
    }
    public static int divi(int n1,int n2) {
        return n1 / n2;
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(MyCalculator.add(a,b));
        System.out.println(MyCalculator.sub(a,b));
        System.out.println(MyCalculator.multi(a,b));
        System.out.println(MyCalculator.divi(a,b));
    }
}
