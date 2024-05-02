package StringBufferExamples;

public class StringB1 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("KLUNIVERSITY");
        System.out.println(s.capacity());
        System.out.println(s.length());
        String s1=new String("KLUNIVERSITY");
//        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s.append("Vijayawada");
        System.out.println(s.capacity());
        s.append("1");
        System.out.println(s);
        System.out.println(s.capacity());
    }
}



