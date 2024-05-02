package exceptionexamples;
class customEx extends Exception{
    public customEx(String a){
        super(a);
    }
}
public class ExceptionEx {
    public static void main(String[] args) {
        try{
            int x=-10;
            throw new customEx("NEgative");
        }catch (customEx e){
            System.err.println(e.getMessage());
        }
    }
}
