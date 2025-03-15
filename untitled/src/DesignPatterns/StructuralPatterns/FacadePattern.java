package DesignPatterns.StructuralPatterns;

interface Shape{
void draw();
}

class Cirlce implements Shape{
  public void draw(){
    System.out.println("Drawing Circle");
  }
  

}

class Rectangle implements Shape{
  
  public void draw(){
    System.out.println("Drawing Rectangle");
  }

}

class ShapeMaker{
  Cirlce c;
  Rectangle r;
  ShapeMaker(){
    c=new Cirlce();
    r=new Rectangle();
  }

  void drawCirlce(){
    c.draw();
  }

  void drawRectangle(){
    r.draw();
  }
}
  

public class FacadePattern {
  public static void main(String[] args) {
    ShapeMaker s=new ShapeMaker();
    s.drawCirlce();
    s.drawRectangle();
  }
 
}
