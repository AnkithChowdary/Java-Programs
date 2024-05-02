package ArraysProblems;

import java.util.Scanner;


public class ArrayD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int s=0;
        for(int k:arr){
            s+=k;
        }
        System.out.println(s);
    }

}
