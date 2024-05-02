package constructorexamples;
 class Student{
     int id;
     String name;
     Student(){
         id=5;
         name="Ankith";
     }
 }
public class StudentDemo {
    public static void main(String[] args){
       Student obj=new Student();
       System.out.println(obj.id);
       System.out.println(obj.name);
    }
}
