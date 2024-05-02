import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass {
  public static void main(String[] args) {
    ArrayList<Integer>li=new ArrayList<>();
    li.add(10);
    li.add(5);
    li.add(1);
    System.out.println(li);
    Collections.sort(li);
    System.out.println(li);
  }
}
