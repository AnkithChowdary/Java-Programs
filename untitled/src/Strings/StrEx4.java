package Strings;

public class StrEx4 {
    public static void main(String[] args) {
        String mystr=new String("I Live in India");
        System.out.println("Length of mystr is:"+mystr.length());
        System.out.println("Character at 3rd Index is:"+mystr.charAt(3));
        mystr.replaceAll("I","We");
        System.out.println("Replaced mystr is:"+mystr);
        System.out.println(mystr.concat("Country"));
        System.out.println(mystr.toUpperCase());
    }
}
