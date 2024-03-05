package C2;

public class WrapperClassEx {
    public static void main(String []args){
        int a=20;
        Integer b=Integer.valueOf(a);
        Integer c=a;
        System.out.println(a+" "+b+" "+c);


        Integer d=new Integer(5);
        int z=d.intValue();    //unboxing
        int v=d;             //autoboxing
        System.out.println(d+" "+ z+" "+v);
    }

}
