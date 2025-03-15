package Abstract;
class vehicles{
  void acclerate(){
    System.out.println("Universal");
  }
  
   void brand(String a){
    System.out.println("The brand is"+a);
   }
  
}

class car extends vehicles{
    void brand(String a){
      System.out.println("Brand is"+a);
    }
}
public class polyExample {
  
}
