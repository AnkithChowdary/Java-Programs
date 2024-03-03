package Week2;

import java.util.Scanner;


public class MyInteger {
    static int value;
    static void initializer(int b){
        value=b;
    }

    static boolean isEven(int k)
        {
         return k%2==0;
        }
      static boolean isOdd(int c){
            return c%2!=0;
        }
    static boolean isPrime(int x){
            int z=0;

            for(int i=2;i<=(int)Math.sqrt(x);i++){
                if(x%i==0)
                    z++;
            }
            return z==0;
        }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int v=sc.nextInt();
           initializer(v);
        System.out.println(isOdd(value));
        System.out.println(isEven(value));
        System.out.println(isPrime(value));

    }
}
