package BasicPrograms;

class Student54{
    int sno;
    String sname;
    Student54(){
        this.sname="Ankith";
        this.sno=5;
    }
    Student54(int sno,String sname)
    {
        this.sname=sname;
        this.sno=sno;
    }
    Student54(int sno){
        this.sno=sno;
    }
    String toString(Student54 obj){
        return "Name: "+sname+" Sno:"+sno;
    }
}


public class Test {
    public static void main(String[] args) {
        Student54 obj1=new Student54();
        System.out.println(obj1.toString(obj1));
        Student54 obj2=new Student54(5,"Ankith");
        System.out.println(obj2.toString(obj2));
        Student54 obj3=new Student54(5);
        System.out.println(obj3.toString(obj3));

    }
}
