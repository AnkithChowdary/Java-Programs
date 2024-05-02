package BasicPrograms;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n; i>0;i--){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
        sc.close();
    }
}
