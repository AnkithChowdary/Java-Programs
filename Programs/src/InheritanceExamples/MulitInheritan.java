package InheritanceExamples;
class Square{
    void find(){
        int l=4,b=10;
        System.out.println(l*b);
    }
}
class PeriRec extends Square{
    int l=10,b=20;
    void rec(){
        System.out.println(2*(l+b));
    }
}
class VolRec
{
    int l=5,b=1,h=5;
    void vol(){
        System.out.println(l*b*h);
    }
}
public class MulitInheritan {

}
