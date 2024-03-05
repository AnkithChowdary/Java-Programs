package C2;

public class Single3 {
    private static Single3 a=new Single3();
    public int c=0;
    private Single3(){

    }
    private static Single3 getInstance(){
       return a;
    }
    void incre(){
        this.c++;
    }
    public static void main(String []args){
        Single3 v=Single3.getInstance();
        v.incre();
        v.incre();
        v.incre();
        System.out.println(v.c);

        Single3 v1=Single3.getInstance();
        v1.incre();
        v1.incre();
        System.out.println(v.c);
    }
}
