package dynamicmethodd;
class MobileOs{
    void display(){
        System.out.println("Mobile operating system");
    }
}
class Android extends MobileOs{
    void display(){
        System.out.println("Android is mobile os");
    }
}
class Ios extends MobileOs{
    void display(){
        System.out.println("Ios is a os");
    }
}
public class Main {
    public static void main(String[] args) {
        MobileOs obj=new MobileOs();
        obj.display();

        obj=new Android();
        obj.display();

        obj=new Ios();
        obj.display();
    }
}
