package ConstructorChaining;
class Temp1{
    Temp1(){
        this(5);

    }
    Temp1(int a){
        this(4,6);
        System.out.println(a);
    }
    Temp1(int a,int b){
        System.out.println(a*b);
    }
}
public class Constructorc {
    public static void main(String[] args) {
        Temp1 t1=new Temp1();
    }
}
