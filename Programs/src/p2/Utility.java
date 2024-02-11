package p2;

public class Utility {
    public static long findReverse(long n){
        long s=0;
        while(n!=0){
            s=s*10+n%10;
            n/=10;

        }
        return s;
    }
}
