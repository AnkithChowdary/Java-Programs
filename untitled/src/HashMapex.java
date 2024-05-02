import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapex {
  public static void main(String[] args){
    ArrayList<Integer>li=new ArrayList<>();
   HashMap<Integer,Integer>h=new HashMap<>();            ///HashMap<key,value>name=new HashMap<>();
   Scanner sc=new Scanner(System.in);
   for(int i=0; i<5; i++){
    int k,v;

k=sc.nextInt();
v=sc.nextInt();
if(h.containsKey(k))
     h.put(k,Math.max(h.get(k),v));
     else
     h.put(k,v);
   }
   sc.close();

    System.out.println(h);
  }
  
}
