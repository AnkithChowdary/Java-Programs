package BasicPrograms;

public class Example4 {
    static int n;
    public static void main(String[] args) {
        int c=fact();
        System.out.println(c);
    }
    public static int fact(){
        n=5;
        int i,f=1;
        for(i=1; i<=n; i++)
            f*=i;
        return f;
    }
}
