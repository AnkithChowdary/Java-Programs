package Abstract;
abstract class animal{
  abstract void sound();

}
class lion extends animal{
  void sound(){
    System.out.println("Lion: Roar");
  }
}
class tiger extends animal{
  void sound(){
    System.out.println("Tiger:Roar!!");
  }
}
public class newAnimal {
  public static void main(String[] args) {
    lion l=new lion();
    l.sound();
    tiger t=new tiger();
    t.sound();
  }
}
