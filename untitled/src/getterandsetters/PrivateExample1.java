package getterandsetters;
class Data1{
  String name;
  void setName(String name){
    this.name=name;
  }
  String getName(){
    return name;
  }
}
public class PrivateExample1 {
  public static void main(String[] args){
Data1 ob=new Data1();
ob.setName("ankith");
System.out.println(ob.getName());
  }
}
