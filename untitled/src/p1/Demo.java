package p1;
import p2.DisplayAll;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        DisplayAll.displayPalindrome(k);
        DisplayAll.displayArmstrong(k);

    }


}
