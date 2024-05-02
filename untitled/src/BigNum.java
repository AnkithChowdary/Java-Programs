import java.math.BigInteger;
import java.util.Scanner;
//We can use this BigInteger for large integer values
//It contains some build in methods
public class BigNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.subtract(b));
    }
}
