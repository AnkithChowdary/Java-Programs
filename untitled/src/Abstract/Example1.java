package Abstract;
abstract class Myclass{
    abstract void Calculate(int a,int b);
}

class Addition extends  Myclass{
    void Calculate(int a,int b){
        System.out.println(a+b);
    }
}
class Sub extends Myclass{
    void Calculate(int a,int b){
        System.out.println(a-b);
    }
}
class Mul extends Myclass{
    void Calculate(int a,int b){
        System.out.println(a*b);
    }
}
class Div extends Myclass{
    void Calculate(int a,int b){
        System.out.println(a/b);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Addition a=new Addition();
        Sub s=new Sub();
        Mul m=new Mul();
        Div d=new Div();
        a.Calculate(5,1);
        s.Calculate(5,1);
        m.Calculate(5,1);
        d.Calculate(5,1);

    }
}
