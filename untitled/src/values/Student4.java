package values;

import java.util.Scanner;
// Accessing with private varibles
public class Student4 {
    private static int num;
    private static String name;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        name=sc.next();
        System.out.println(num);
        System.out.println(name);
    }
}
