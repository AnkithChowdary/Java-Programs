package C1;

import java.util.Scanner;

public class Inp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=(a+b+c)/3;
        System.out.println(d);
        sc.close();
    }
}
