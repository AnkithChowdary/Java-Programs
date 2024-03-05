package InheritanceExamples;
class Office{
    void admission(){
        System.out.println("Get admitted");
    }
}
class Student5 extends Office{
    void branch(){
        System.out.println("CSE");
    }
}
public class College5 {
    public static void main(String []args){
        Student5 obj=new Student5();
        obj.branch();
        obj.admission();
    }
}
