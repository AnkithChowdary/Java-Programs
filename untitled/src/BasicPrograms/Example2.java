package BasicPrograms;

public class Example2 {
    static int n,i,f=1;
    public static void main(String[] args) {
        n=5;
        for(int i=1; i<=n; i++)
            f*=i;
        System.out.println(f);
    }
}
