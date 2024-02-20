package getterandsetters;
class Data2{
  private int n1;
  private int n2;
  void setN1(int n1){
  this.n1=n1;
  }
  void setN2(int n2){
    this.n2=n2;
  }
  private int c=this.n1+this.n2;
  int getC(){
    return this.c;   
  }
  
}
public class PrivateExamples2 {
  public static void main(String[] args){
        Data2 obj=new Data2();
        obj.setN1(5);
        obj.setN2(4);
        System.out.println(obj.getC());
  }
}
