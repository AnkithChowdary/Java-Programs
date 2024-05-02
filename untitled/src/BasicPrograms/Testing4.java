package BasicPrograms;

public class Testing4 {
    public static void main(String[] args) {
        new Person().printPerson();
        new Student544().printPerson();
    }
}
class Student544 extends Person{
    private String getInfo(){
        return "Student";
    }
}
class Person{
    private String getInfo(){
        return "BasicPrograms.Person";
    }
    public void printPerson(){
        System.out.println(getInfo());
    }
}
