package Recursion;

public class Fibonacii {
    public static int FibonaciiSeries(int n){
        if(n<=1){
            return n;
        }
        int last=FibonaciiSeries(n-1);
        int slast=FibonaciiSeries(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        System.out.println(FibonaciiSeries(5));
    }
}
