package Strings;

import java.util.Scanner;

public class Wordle {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String a = sc.next();
            String b = sc.next();
            char[] c = new char[a.length()];
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i))
                    c[i] = 'G';                 //If the Guessed word matches the orginal one
                else
                    c[i] = 'B';                //If the Guessed character doesn't match the orginal one
            }
            System.out.println(new String(c));
        }
    }
}
