package StringTokenizerEx;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        StringTokenizer s=new StringTokenizer("Hello my name is hary potter");
        int c=0;
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
            c++;
        }
        System.out.println(c);
    }
}
