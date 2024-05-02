package InheritanceExamples;
class College{
    void admission(){
        System.out.println("get admitted");
    }
}
class Student extends College{
    void branch(){
        System.out.println("CSE");
    }
}
class Roll extends College{
    void no(){
        System.out.println("");
    }
}
public class Multi2 {
    public static void main(String[] args) {
        Roll r=new Roll();
        r.no();
        r.admission();

    }
}
