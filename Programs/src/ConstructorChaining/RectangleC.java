package ConstructorChaining;
class Rec{
    Rec(){
        this(4);
    }
    Rec(int s){
        this(4,6);
      System.out.println(s);
    }
    Rec(int l,int b){
        this(4,6,10);
        System.out.println(l*b);
    }
    Rec(int l,int b,int h){

        System.out.println(l*b*h);
    }
}
public class RectangleC
{
    public static void main(String[] args){
        Rec obj=new Rec();

    }
}
