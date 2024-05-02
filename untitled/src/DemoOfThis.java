class Data{
  int a,b;
  void giveData(int a,int b){
     a=a;
     b=b;
  }
  void printData(){
System.out.println(a+" "+b);
  }
}





public class DemoOfThis {
  public static void main(String[] args){
 Data obj=new Data();
 obj.giveData(5, 10);
 obj.printData();

  }
  
}
