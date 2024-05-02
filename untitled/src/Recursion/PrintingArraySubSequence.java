package Recursion;

import java.util.ArrayList;

public class PrintingArraySubSequence {

    public static void subSequence(int []arr,int i, ArrayList li){
        if(i>=arr.length){
            System.out.println(li);
            return;
        }

    }
    public static void main(String[] args) {
      int []arr=new int[5];
      for(int i=0;i<arr.length;i++){
          arr[i]=i;
      }
      ArrayList<Integer>li=new ArrayList<>();
      subSequence(arr,0,li);
    }
}
