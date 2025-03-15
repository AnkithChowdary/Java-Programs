package DesignPatterns.StructuralPatterns;


interface DrawApi{
  void draw(int x,int y,int radius);
}

class RedCircle implements DrawApi{
  public void draw(int x,int y,int radius){
    System.out.println("Red circle X:"+x+" Y:"+y+" Radius:"+radius);
  }
}

class GreenCircle implements DrawApi{
  public void draw(int x,int y,int radius){
    System.out.println("Green circle X:"+x+" Y:"+y+" Radius:"+radius);
  }
}


abstract class Shape{
  protected DrawApi d;

  protected Shape(DrawApi d){
    this.d=d;

  }
  abstract void draw();
}
class Circle extends Shape{
  int x,y,radius;
  
 public Circle(int x,int y,int radius,DrawApi d){
    super(d);
    this.x=x;
    this.y=y;
    this.radius=radius;
  }
  void draw(){
     d.draw(x, y, radius);
  }
}



public class BridgePattern {
  public static void main(String[] args) {
    Shape c=new Circle(5,4,10,new RedCircle());
    c.draw();
  }
}
