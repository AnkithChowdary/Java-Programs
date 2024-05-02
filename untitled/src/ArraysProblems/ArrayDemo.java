package ArraysProblems;

import java.util.Scanner;


public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 1;
        arr[2] = 7;
        arr[3] = 7;
        arr[4] = 7;
        arr[5] = 7;
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int k : arr)
            System.out.println(k);
        Scanner sc=new Scanner(System.in);
        int []arr1=new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i]=sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int k : arr1)
            System.out.println(k);

    }
}
