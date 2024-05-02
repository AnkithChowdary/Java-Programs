package getterandsetters;

class Volume{
  private double l;
  private double b;
  private double h;
  void setL(double l){
      this.l=l;
  }
  void setB(double b){
    this.b=b;
  }
  void setH(double h){
    this.h=h;
  }
  double getL(){
    return this.l;
  }
  double getB(){
    return this.b;
  }
  double getH(){
    return this.h;
  }


  double forCalc(){
    return getB()*getL()*getH();
  }
   String toString(Volume an)
   {
return "getterandsetters.Volume:"+getB()+" Breadth"+getB()+" Height:"+getH();
   }
}





public class GettersCuboid {
  public static void main(String[] args){
Volume obj=new Volume();
  obj.setB(5.2);
  obj.setH(7.2);
  obj.setL(4.1);
System.out.println(obj.forCalc());
System.out.println(obj.toString(obj));

  }
}
