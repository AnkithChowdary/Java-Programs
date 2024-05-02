import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {
        Vector v1=new Vector();
        Vector v2=new Vector(20);
        Vector v3=new Vector(30,10);
        List<String> li=new ArrayList<>();
        li.add("Ankith");
        li.add("chowdary");
        Vector v4=new Vector(li);
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v3);

        System.out.println(v4);


    }
}
