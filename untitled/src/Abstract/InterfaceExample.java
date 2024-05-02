package Abstract;
interface shape1{
  int area(int l,int b);
  void draw();
}
class Rectangle1 implements shape1{
  public int area(int l,int b){
    return l*b;
  }
  public void draw(){
    System.out.println("Drawing rectangle");
  }
}
class Circle1 implements shape1{
  public int area(int l,int b){
    return (int)Math.PI*l*b;
  }
  public void draw(){
    System.out.println("Drawing circle");
  }
}
public class InterfaceExample {
  public static void main(String[] args) {
    Rectangle1 a=new Rectangle1();
    Circle1 k=new Circle1();
     System.out.println(a.area(5, 4));
     a.draw();
     System.out.println(k.area(5, 4));
    k.draw(); 
  }
  
}
