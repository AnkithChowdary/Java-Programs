package Abstract;



abstract class shape{
  abstract int area(int l,int b);
  abstract void draw();
}
class Rectangle extends shape{
  int area(int l,int b){
    return l*b;
  }
  void draw(){
    System.out.println("Drawing rectangle");
  }
}
class Circle extends shape{
  int area(int l,int b){
    return (int)Math.PI*l*b;
  }
  void draw(){
    System.out.println("Drawing circle");
  }
}

public class Example2 {
  public static void main(String[] args) {
    Rectangle a=new Rectangle();
    Circle k=new Circle();
     System.out.println(a.area(5, 4));
     a.draw();
     System.out.println(k.area(5, 4));
    k.draw();
  }
}
