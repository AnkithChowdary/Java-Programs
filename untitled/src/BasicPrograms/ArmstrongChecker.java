package BasicPrograms;

import java.util.*;

class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
                                            // I created a object of BasicPrograms.Checker class
        Checker checker = new Checker();    //Use function instead if you want
        String result = checker.checkArmstrong(n);

        System.out.println(result);
    }
}

class Checker {
    public String checkArmstrong(int n) {
        int res = 0;
        int org = n;
        int k = (int) Math.log10(n) + 1;

        while (org != 0) {
            int digit = org % 10;
            res += (int)Math.pow(digit, k);
            org /= 10;
        }

        if (res == n) {
            return n + " is an Armstrong number";
        } else {
            return n + " is not an Armstrong number";
        }
    }
}
