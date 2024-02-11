package Strings;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder(""); // Create a new StringBuilder object named 'a' with an initial empty string.
        
        for (char i = 'a'; i <= 'z'; i++) {
            a.append(i); // Append each character from 'a' to 'z' to the StringBuilder.
        }
        
        System.out.println(a); // Print the resulting string stored in the StringBuilder.

    }
}
