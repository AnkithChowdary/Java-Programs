package modularizationExamples;

class demo{
  public static int fact(int n){
    int i,f=1;
    for(i=1; i<=n; i++){
      f*=i;
    }
    return f;
  }

}
public class ClassMod {
  public static void main(String[] args) {
    int n=5;
    System.out.println(demo.fact(n));


  }
}
