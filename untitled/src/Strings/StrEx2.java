package Strings;

public class StrEx2 {
    public static void main(String[] args) {
        String str="Welcome to Java programming";
        for(int i=0; i<str.length();i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
