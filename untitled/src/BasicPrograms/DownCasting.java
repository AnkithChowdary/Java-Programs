package BasicPrograms;

class abc{
  void show(){
 System.out.println("In A");
  }}
  class D extends abc{
    void show1(){
      System.out.println("In B");

    }
  }


public class DownCasting {
  public static void main(String[] args){
   abc obj=(abc)new D();
   obj.show();
   D obj1=(D)obj;
   obj1.show1();
    


  }
  
}
