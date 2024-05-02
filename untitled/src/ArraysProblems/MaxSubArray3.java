package ArraysProblems;

public class MaxSubArray3 {
  public static void kadanes(int arr[]){
      int curr=0,max=Integer.MIN_VALUE,flag=0;
      for(int i=0; i<arr.length; i++){
          if(arr[i]>0)
          flag=1;
      }
      if(flag==1){
      for(int i=0; i<arr.length;i++){
        curr+=arr[i];
        if(curr<0){
          curr=0;
        }
        max=Math.max(curr, max);
      }
      System.out.println("max:"+max);
      }else {
              for (int i = 0; i < arr.length; i++) 
                  max = Math.max(arr[i], max);
          
              System.out.println("Max:"+max);
          }
  
      }
      
  
  public static void main(String args[])
  {
     int arr[]={-2,-3,4,-1,-2,1,5,-3};
     kadanes(arr);
  }
}
