public class ReveerseArray{


  public static void swap(int []arr,int a,int b){
    int t=arr[a];
    arr[a]=arr[b];
    arr[b]=t;
  }
  public static void reverse(int arr[],int l,int r){
      if(l>=r){
        return;
      }
      swap(arr,l,r);
      reverse(arr,l+1,r-1);

  }
public static void main(String[] args) {
  int []arr=new int[5];
  
  for(int i=0;i<arr.length;i++){
    arr[i]=i;
  }
  reverse(arr,0,arr.length-1);


  
  for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
  }
}


}