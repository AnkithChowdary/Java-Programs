package modularizationExamples;
public class MethodMod {
  public static void main(String[] args) {
    int n=5; 
    int r=fact(n);
    System.out.println(r);
  }
  public static int fact(int n){
    int i,f=1;
    for(i=1; i<=n; i++){
      f*=i;
    }
    return f;
  }
}
