public class Example4 {
    static int n;
    public static void main(String[] args) {
        fact();
    }
    public static int fact(){
        n=5;
        int i,f=1;
        for(i=1; i<=n; i++)
            f*=i;
        System.out.println(f);
    }
}
