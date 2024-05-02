package PlacementProblems;

public class TrappingRain {
  public int trap(int[] height) {
    int k=height.length;
    //Calculating left boundary array
    int[] leftMax =new int[k];
    leftMax[0]=height[0];
    for(int i=1; i<k; i++){
        leftMax[i]=Math.max(height[i],leftMax[i-1]);
    }
    //Calculating right boundary array
    int[] rightMax =new int[k];
    rightMax[k-1]=height[k-1];
    for(int i=k-2; i>=0; i-- ){
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
    }
    int tw=0;
    for(int i=0; i<k; i++){
        int wl=Math.min(leftMax[i],rightMax[i]);
        tw+=wl-height[i];
    } 
    return tw;
}
public static void main(String[] args) {
  int height[]={4,2,0,6,3,2,5};
  TrappingRain sd=new TrappingRain();
  System.out.println(sd.trap(height));
}
}
