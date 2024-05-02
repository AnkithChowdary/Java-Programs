package StringBufferExamples;

public class sb3 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("KLUNIVERSITY");
        System.out.println(s);
        s.insert(2,"is");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.delete(0,1);
        System.out.println(s);
        s.deleteCharAt(1);
        System.out.println(s);
        s.replace(2,5,"Ac");
        System.out.println(s);
    }
}
