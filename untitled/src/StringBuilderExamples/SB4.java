package StringBuilderExamples;

public class SB4 {
    public static void main(String[] args) {
        StringBuilder b=new StringBuilder("Hello");
        System.out.println(b.capacity());
        b.append("Java");
        System.out.println(b.capacity());
        b.append("Hello my name is ankith");
        System.out.println(b.capacity());     //21*2+2
    }
}
