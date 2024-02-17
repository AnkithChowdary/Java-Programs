package values;
class student51{
    int sno;
    String name;
    void display(){
        System.out.println(sno);
        System.out.println(name);
    }
}
public class Student5 {
    public static void main(String[] args){
        student51 obj=new student51();
        obj.name="ankith";
        obj.sno=38;
    }
}
