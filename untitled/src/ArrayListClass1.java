import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListClass1 {
  public static void main(String[] args) {
    int arr[]={1,1,0,50};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));



    char arr1[]={'D','C','B','A'};
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));
    ArrayList <Character>li=new ArrayList<>();
    li.add('a');
    li.add('c');
    li.add('c');
    li.add('b');
    Collections.sort(li);
    
  }
}
