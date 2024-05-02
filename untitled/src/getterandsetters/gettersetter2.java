package getterandsetters;

class Student{
    private String name;
     private int id;
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


public class gettersetter2 {
    public static void main(String[] args) {
        Student s1=new Student();

        s1.setId(101);
        s1.setName("ankith");

        System.out.println(s1.getId());
        System.out.println(s1.getName());

    }
}
