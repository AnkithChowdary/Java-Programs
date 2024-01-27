package InheritanceExamples;

interface car{
    public void show();
    public void drive();
}
class driver implements car{
    public void show(){
        System.out.println("Nothing...");
    }
    public void drive(){
        System.out.println("Driving");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
      driver obj=new driver();
      obj.drive();
      obj.show();
    }
}
