package SortingInJava;

public class selectionSort {
  public void sort1(int arr[]){
     for(int i=0; i<arr.length-1;i++){
      int min=i;
      for(int j=i+1; j<arr.length-1; j++){
        if(arr[min]>arr[j]){
          min=j;
        }
      }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;

     }

  }
  public void print(int an[]){
    System.out.println("Sorted array:");
    for(int i=0; i<an.length; i++)
    {
      System.out.print(an[i]+" ");
    }
  }
  public static void main(String args[]){
     int an[]={5,4,3,1,7};
     selectionSort ac=new selectionSort();
     ac.sort1(an);
     ac.print(an);
  }
  
}
