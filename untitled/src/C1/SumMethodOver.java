package C1;

import java.util.Scanner;

public class SumMethodOver {


    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a[]){
        int s=0;
        for(int k:a)
            s+=k;

        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SumMethodOver x1=new SumMethodOver();
        SumMethodOver x2=new SumMethodOver();
        SumMethodOver x3=new SumMethodOver();
        System.out.println(x1.sum(5,6));
        System.out.println(x2.sum(4,6,7));
       int []a=new int[5];
       for(int i=0; i<5; i++){
           a[i]=sc.nextInt();
       }
        System.out.println(x3.sum(a));

    }
}
