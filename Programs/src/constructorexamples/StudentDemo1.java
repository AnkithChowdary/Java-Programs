package constructorexamples;
class Student1{
    int id;
    String name;
    Student1(int n,String name){
        this.id=n;
        this.name=name;
    }
}
public class StudentDemo1 {
    public static void main(String[] args){
        Student1 obj=new Student1(5,"ankith");
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
