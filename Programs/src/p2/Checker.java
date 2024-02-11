package p2;

public class Checker {
    public static boolean isArmstrong(int n){
        int k=n;
        int s=0;
        int p=(int)Math.log10(n)+1;
        while(k!=0){
          s=s+(int)Math.pow(k%10,p);
          k/=10;
        }
        return s == n;
    }
   public static boolean isPalindrome(long n){
        return n==Utility.findReverse(n);
   }
}
