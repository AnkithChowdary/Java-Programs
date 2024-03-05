package C2;

public class Single2 {
    private static Single2 obj=new Single2();
    public int a,b;
    private Single2(){
        a=10;
        b=15;
    }
    private static Single2 getInstance(){
        return obj;
    }
    int add(){
        return this.a+this.b;
    }
    public static void main(String []args){
        Single2 t2=Single2.getInstance();
        System.out.println(t2.a);
        System.out.println(t2.b);
        System.out.println(t2.add());
    }
}
