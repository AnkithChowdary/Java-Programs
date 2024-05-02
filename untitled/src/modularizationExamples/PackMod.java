package modularizationExamples;

public class PackMod {
    // Example factorial method
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
