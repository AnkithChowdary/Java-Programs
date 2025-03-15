package week2Skill;

class Sensor{
  public double getTemp(){
    return 50;
  }
}
class Adaptor{
  private Sensor s;
  Adaptor(Sensor s){
    this.s=s;
  }
  public double getTemp(){
    return 9*s.getTemp()/5+32;
  }
}
class Alarm{
  private Adaptor a;
  Alarm(Adaptor a){
    this.a=a;
  }
  public void getAlarm(){
    if(a.getTemp()>30)
    System.out.println("High temp");
    else
    System.out.println("Normal");
  }
}

public class EndUserAdaptor {
  public static void main(String[] args) {
    Sensor s=new Sensor();
    Adaptor a=new Adaptor(s);
    Alarm al=new Alarm(a);
    al.getAlarm();
  }
  
}
