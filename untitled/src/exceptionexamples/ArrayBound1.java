package exceptionexamples;

public class ArrayBound1 {
  public static void main(String[] args) {
    int[] arr=new int[2];
    arr[0]=10;
    arr[1]=20;
    System.out.println(arr[4]);
  }
}
