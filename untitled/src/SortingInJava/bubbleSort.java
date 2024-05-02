package SortingInJava;

public class bubbleSort {
  public void sort(int k[]){
    int temp;
    for(int i=0; i<k.length-1; i++){
      for(int j=0; j<k.length-i-1; j++){
        if(k[j]>k[j+1]){
           temp=k[j];
           k[j]=k[j+1];
           k[j+1]=temp;
        }
      }
    }
    
  }
  public static void main(String args[]){
    int k[]={1,5,4,0,-1,7};
    bubbleSort bs=new bubbleSort();
    bs.sort(k);
    System.out.println("Sorted arrary:");
    for(int i=0; i<k.length; i++){
      System.out.println(k[i]+" ");
    }
  }
}
