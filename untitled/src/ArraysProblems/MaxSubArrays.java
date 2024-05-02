package ArraysProblems;

class MaxSubArrays{
static void subarrayS(int arr[]){
  int c=0;
    for(int i=0; i<arr.length;i++){
      int start=i;
      for(int j=i;j<arr.length;j++){
int end=j;

for(int k=i;k<=j;k++){
  System.out.print(arr[k]+" ");
  
}
if(j-i+1>1)
  c--;
  else
c++;
System.out.println();
      }
     
    }
    System.out.println("C:"+c);
}
  public static void main(String[] args) {
    int []arr={5,40,1,3,4,6};
subarrayS(arr);
  }
}