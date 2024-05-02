package ArraysProblems;

public class MaxSubArray2 {
  public static void sub(int arr[]){
    int curr=0,max=Integer.MIN_VALUE,prefix[]=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1; i<arr.length; i++){
      prefix[i]=prefix[i-1]+prefix[i];
    }
    for(int i=0; i<arr.length; i++){
      
      for(int j=i; j<arr.length; j++){
        curr=0;
         
          curr=i==0?prefix[i]:prefix[j]+prefix[i-1];
          
          System.out.println(curr);
          if(max<curr)
          max=curr;
        
      }
      
    }
    System.out.println("Total maxsum:"+max);
  }
  public static void main(String args[])
  {
     int arr[]={2,4,6,8,10};
     sub(arr);
     System.out.println(arr);
  }
}
