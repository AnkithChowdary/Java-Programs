package C1;

import java.util.Scanner;
class Helper5{

    public static void reverse1(int k){
        int s=0;
        while(k!=0){
            s=s*10+k%10;
            k/=10;
        }
        System.out.println(s);

    }

}







public class Rev2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Helper5.reverse1(n);
    }

}
