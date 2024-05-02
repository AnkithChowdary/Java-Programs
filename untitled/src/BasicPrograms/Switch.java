package BasicPrograms;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b:");
        int b = sc.nextInt();
        char o = sc.next().charAt(0);
        Send(a, b, o);
        sc.close();
    }
    public static void Send(int s, int d, char o)
    {
        switch (o){
            case '+':
                System.out.println(s+d);
                break;
            case '-':
                System.out.println(s-d);
                break;
            case '*':
                System.out.println(s*d);
                break;
            case '/':
                System.out.println((float)s/d);
                break;
            default:
                break;

        }
        
    }
}
