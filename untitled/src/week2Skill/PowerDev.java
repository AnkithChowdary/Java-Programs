package week2Skill;

import java.rmi.Remote;

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
abstract class RemoteControl{
 protected InnerPowerDev d;
  protected RemoteControl(InnerPowerDev d){
    this.d=d;
  }
public void turnOn(){};
public void turnOff(){};
public void setVolum(int v){};
}

class TVRemote extends RemoteControl{
  public TVRemote(Tv t){
    super(t);
  }
  public void turnOn(){
    d.powerOn();
  }
  public void turnOff(){
    d.powerOff();
  }
  public void setVolum(int v)
  {
    d.setVolum(v);
  }
}
class RadioRemote extends RemoteControl{
  public RadioRemote(Radio r){
    super(r);
  }
  public void turnOn(){
    d.powerOn();
  }
  public void turnOff(){
    d.powerOff();
  }
  public void setVolum(int v)
  {
    d.setVolum(v);
  }

}




public class PowerDev {
  public static void main(String[] args) {
    InnerPowerDev t=new Tv();
   RemoteControl rc=new TVRemote(t);
   rc.turnOn();
   rc.setVolum(30);
   InnerPowerDev ic=new Radio();
   RemoteControl a=new RadioRemote(ic);
   rc.turnOn();
   rc.turnOff();
  }
}
