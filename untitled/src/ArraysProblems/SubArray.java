package ArraysProblems;

public class SubArray {
 // The `subarray` method takes an array `arr` as input and prints all the subarrays of `arr`.
  public static void subarray(int arr[]){
    int c=0;
    for(int i=0; i<arr.length; i++){
      for(int j=i; j<arr.length; j++){
          for(int k=i; k<=j; k++){
            System.out.println(arr[k]+" ");
          }
          if(i!=j)
          c--;
          c++;
          System.out.println();
      }
      
    }
    System.out.println("Total subarray:"+c);
  }
  public static void main(String args[])
  {
     int arr[]={5,5,5,5};
     subarray(arr);
     System.out.println(arr);
  }
}
