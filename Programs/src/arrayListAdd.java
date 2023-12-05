import java.util.ArrayList;

public class arrayListAdd {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
  list.add(1);
  list.add(2);
  System.out.println(list);
  int element =list.get(0);
  System.out.println(element);
  //Remove operation
  list.remove(0);
  System.out.println(list);
  // Set Operation
  System.out.print("Set Operation: ");
  list.set(0,10);
  System.out.println(list);
  list.add(5);
  list.add(4);
  System.out.println(list);
  //Contains operation
  System.out.println(list.contains(4));
  System.out.println(list.contains(0));
  list.add(1,7);
  System.out.println(list);
  }
  
}
