package ConstructorChaining;
class Rec1 {
    Rec1() {
        System.out.println("Defualt");
    }

    Rec1(int s) {
        this();
        System.out.println(s);
    }

    Rec1(int l, int b) {
        this(5);
        System.out.println(l * b);
    }

    Rec1(int l, int b, int h) {
this(4,6);
        System.out.println(l * b * h);
    }
}
public class Rectangle2 {
    public static void main(String[] args){
        Rec1 obj=new Rec1(5,4,10);
    }
}
