package C1;

import java.util.Scanner;

public class Table1 {
    public static void add(int n){
        for(int i=1; i<=10; i++)
            System.out.println(n+"x"+i+"="+n*i);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        add(k);
    }


}
