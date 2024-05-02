import java.util.Scanner;

public class Palindrome {
  

  public static boolean palindromeCheck(char[] arr,int i){
    if(i>=arr.length/2)return true;
    if(arr[i]!=arr[arr.length-i-1]){
      return false;
    }
return palindromeCheck(arr,i+1);
   
    


  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    System.out.println(palindromeCheck(a.toCharArray(),0));
    sc.close();
  }
}
