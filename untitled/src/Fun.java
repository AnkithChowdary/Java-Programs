import java.util.Scanner;
public class Fun {

  static void sum(int a){
    System.out.println(a+a);
  }

  static void sum(double a){
    System.err.println(a+a);
  }

static void sum(int a,int b){
  System.out.println(a+b);
}

static void sum(int a,int b,int c){
  System.err.println(a+b+c);
}

  int fact(int a){
    int k=1;
  for(int i=2; i<=a; i++)
  k*=i;
   return k;
  }
  public static void main(String args[]){
    System.out.println("Enter the value:");
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    Fun ac=new Fun();
    System.out.println("BasicPrograms.Factorial is "+ac.fact(b));
    sc.close();
  }
}
