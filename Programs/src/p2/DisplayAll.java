package p2;

public class DisplayAll {
    public static void displayPalindrome(long n){
        System.out.println("The palindrom number are:");
        for(int i=1; i<=n;i++){
        if(Checker.isPalindrome(i)){
            System.out.println(i);
        }

    }
    }
    public static void displayArmstrong(int n){
        System.out.println("The armstrong number are:");
          for(int i=1; i<=n;i++){
              if(Checker.isArmstrong(i))
                  System.out.println(i);
          }
    }
    }
