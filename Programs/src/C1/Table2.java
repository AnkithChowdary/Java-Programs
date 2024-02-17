package C1;

import java.util.Scanner;

class Driver{
    public static void helper(int n){
        for(int i=1; i<=10; i++)
            System.out.println(n+"x"+i+"="+n*i);
    }
}
public class Table2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Driver.helper(n);
    }
}
