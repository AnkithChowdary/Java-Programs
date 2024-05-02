package Strings;

public class StrEx5 {
    public static void main(String[] args) {
        String s1="Welcome to Java";
        String s2="Welcome to java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.startsWith("We"));
        System.out.println(s1.endsWith("be"));
        System.out.println(s1.contains("to"));
    }
}
