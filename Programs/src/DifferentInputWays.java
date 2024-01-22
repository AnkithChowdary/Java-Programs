import java.util.Scanner;
public class DifferentInputWays {
    public static void main(String[] args){


       getInputFromScanner();
        getInputFromConsole();
        
    }
    public static void getInputFromConsole(){
        String name= System.console().readLine("what's your name:");
        System.out.println("Your name is "+name);
    }
    public static void getInputFromScanner(){
       Scanner an =new Scanner(System.in);
       String k= an.next();
       System.out.println("your name is : "+k);
       an.close();
      
    }
}
