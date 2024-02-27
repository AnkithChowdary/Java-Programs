package constructorexamples;
class Rectangle1{
    int length;
    int breadth;
    Rectangle1(){
        length=4;
        breadth=2;
    }
    int s;
    Rectangle1(int s){
         this.s=s;
    }
    int area1(){
        return s*s;
    }
    Rectangle1(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int area(){
        return length*breadth;
    }
}
public class RectangleDemo1 {
    public static void main(String[] args){
        Rectangle1 obj1=new Rectangle1();
        Rectangle1 obj2=new Rectangle1(6);
        Rectangle1 obj=new Rectangle1(5,4);
        System.out.println(obj.area());


        System.out.println(obj1.area());
    }
}
