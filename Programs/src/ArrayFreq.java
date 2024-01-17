import java.util.*;
public class ArrayFreq {
  public static void main(String []args){
    int [] arr=new int[]{1,4,1,1,7,6,4,3,4,8,2,7};
    int [] freq=new int[arr.length];
    int visited=-1;
    for(int i=0; i<arr.length;i++){
      int count=1;
      for(int j=i+1;j<arr.length; j++){
        if(arr[i]==arr[j]){
          count++;
          freq[j]=visited;
        }
      }
      if(freq[i]!=visited)
      freq[i]=count;
    }
    for(int i=0; i<freq.length;i++){
      if(freq[i]!=-1){
        System.out.println("Element:"+arr[i]+" Frequency:"+freq[i]);
      }
    }
  }
  
}
