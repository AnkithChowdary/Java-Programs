import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FrequencyInMap{
  public static void main(String []args){
  Scanner sc=new Scanner(System.in);
  HashMap<Integer,Integer>mp=new HashMap<>();
  int []arr={10,5,1,3,7,6,5,5,5,10};
  
  for(int a:arr){
    if(mp.containsKey(a)){
      mp.put(a,mp.get(a)+1);
    }else{
    mp.put(a,1);
    }
    
  }
  // for(int i=0;i<arr.length;i++){
  //   mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
  // }

  Set<Integer>s=mp.keySet();
  for(Integer x:s){
      System.out.println("Key = "+x+" Value = "+mp.get(x));
  }

}
}