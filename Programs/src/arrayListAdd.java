/**
 * The above class demonstrates various operations that can be performed on an ArrayList in Java, such
 * as adding elements, accessing elements, removing elements, setting elements, checking if an element
 * is present, sorting the list, finding the maximum element, and iterating through the list.
 */
import java.util.*;

public class arrayListAdd {
  public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();    //Array list syntax ArrayList<Data type with starting capital>listName=new Arraylist<>();
  list.add(1);                                  //It's like declaring objects
  list.add(2);
  System.out.println(list);

  int element =list.get(0);
  System.out.println(element);

  //Remove operat
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

  System.out.println(list.size());

  for(int i=0; i<list.size(); i++)
  System.out.print(list.get(i)+" ");

  Collections.sort(list);
  System.out.println(list);
  Collections.reverse(list);
  System.out.println(list);
  int x=Collections.max(list);
  System.out.println("Max Element is: "+x);
  int max=Integer.MIN_VALUE;
   for(int i=0; i<list.size(); i++)
   if(list.get(i)>max)
   max=list.get(i);
   System.out.println("Max: "+max);
  }


}
