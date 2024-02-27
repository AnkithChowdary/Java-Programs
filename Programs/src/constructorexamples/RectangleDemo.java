package constructorexamples;
class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length=4;
        breadth=2;
    }
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int area(){
        return length*breadth;
    }
}
public class RectangleDemo {
    public static void main(String[] args){
        Rectangle obj=new Rectangle(5,4);

        System.out.println(obj.area());
    }
}
