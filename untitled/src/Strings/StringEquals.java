package Strings;

public class StringEquals {
  public static void main(String[] args) {
    String a="Ankith";              //Both the strings points to same in memory
    String b="Ankith";
    String c=new String("Ankit");
    if(a==b)
    System.out.println("Both are equal");                     // Instead of this we use equals (Value comparsion)
                      if(a.equals(c))
                      System.out.println("Both are equal"); 

  }


  
}
