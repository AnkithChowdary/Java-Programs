package getterandsetters;

class Student1{
    private String name;
    private int id;
Student1(){

    }
    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }




}


public class GetterSetters3 {
    public static void main(String[] args) {
        Student1 s1=new Student1(101,"ankith");

        Student1 s2= new Student1();

        s2.setId(102);
        s2.setName("yogendra");

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s2.getId());
    }
}
