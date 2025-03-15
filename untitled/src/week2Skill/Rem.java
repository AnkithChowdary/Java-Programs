package week2Skill;
interface InnerPowerDev{
  void powerOn();
  void powerOff();
  void setVolum(int v);


  
}
class Tv implements InnerPowerDev{
  boolean s;
  int v;
  public void powerOn(){
    s=true;
    System.out.println("Tv is on");
  }
  public void powerOff(){
    s=false;
    System.out.println("Tv is off");
  }
  public void setVolum(int v){
    this.v=v;
  }
}
class Radio implements InnerPowerDev{
  boolean s;
  int v;
  public void powerOn(){
    s=true;
  
  }
  public void powerOff(){
    s=false;
   
  }
  public void setVolum(int v){
    this.v=v;
  }
}
public abstract class Rem

public class PowerDev {
  
}
