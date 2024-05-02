package C2;

public class Singleton {

    private static Singleton obj=new Singleton();
    private String input;
    private Singleton(){
        input="Hello";
    }
    private static Singleton getInstance(){
        return obj;
    }
    public static void main(String []args){
        Singleton t=Singleton.getInstance();
        System.out.println(t.input);
        Singleton t1=Singleton.getInstance();
        System.out.println(t1.input);
    }
}
