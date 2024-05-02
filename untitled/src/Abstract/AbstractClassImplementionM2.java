package Abstract;
//Abstract class implemention using anonymous class 
abstract class Car{
  public void music(){
    System.out.println("");
  }
  abstract void fly();
}
class Car12 extends Car {
  void fly(){
    System.out.println("flying");
  }
}

public class AbstractClassImplementionM2{


  //Instead of using inheritance we can use anonymous way
  public static void main(String[] args){
     //Here we don't actually create the object and we can't create object for abstract classes 
     //We are simply writing the implemention of methods of that class
     Car obj=new Car(){
        public void fly(){
          System.out.println("Car flying");
        }
     };
     obj.fly();
  }
}