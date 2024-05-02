package Strings;

public class StringCmp {
  public static void main(String[] args) {
    String n="Ankith";
    String n1="ankith";


    // String  compareto() treats upper and lower case differently

    System.out.println(((n.compareTo(n1))<0)?"String one is smaller than string 2":(n.compareTo(n1)>0)?"String 2 is smaller":"Both the strings are equal");
    // String comparetoIgnorecase treats both upper and lower case letters equally
    System.out.println(((n.compareToIgnoreCase(n1))<0)?"String one is smaller than string 2":(n.compareTo(n1)>0)?"String 2 is smaller":"Both the strings are equal");

  }
}
