//package Pattern;
//
//import java.util.Scanner;
//
//interface class Shape {
//    void findPeri() {
//
//    }
//
//    void findArea() {
//
//    }
//}
//class Circle implements Shape{
//    void findPeri(int r){
//        System.out.println(2*Math.PI*r);
//    }
//    void findArea(int r){
//        System.out.println(Math.PI*Math.pow(r,2));
//    }
//}
//class Rectangle implements Shape{
//    void findPeri(int l,int b){
//        System.out.println("Perimeter of rec:"+2*(l+b));
//    }
//    void findArea(int l,int b){
//        System.out.println("Area of rec:"+l*b);
//    }
//}
//
//class Square implements Shape{
//    void findPeri(int s){
//        System.out.println();
//    }
//    void findArea(int s){
//        System.out.println(s*s);
//    }
//}
//
//class ShapeDemo23{
//   Shape getInstance(String obj){
//       if(obj.equalsIgnoreCase("Circle"))
//           return new Circle();
//       if(obj.equalsIgnoreCase("Rectangle"))
//           return new Rectangle();
//       if(obj.equalsIgnoreCase("Square"))
//           return new Square();
//   }
//}
//
//public class Factory{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//  ShapeDemo23 a=new ShapeDemo23();
//  String className;
//  boolean t=true;
//  while(t){
//      className=sc.next();
//      Object k=a.getInstance(className);
//        k.findarea();
//        k
//  }
//    }
//}
//
