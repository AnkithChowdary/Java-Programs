package Strings;

public class StrEx3 {
    public static void main(String[] args) {
        String str="Welcome to Java Programming";
        int c=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='m'){
                c++;
            }
        }
        System.out.println(c);
    }
}
