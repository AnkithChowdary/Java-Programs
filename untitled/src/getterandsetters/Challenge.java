package getterandsetters;

import java.util.Scanner;

class Customer{
    String name;
    int id;
      Customer(String name, int id){
          this.name=name;
          this.id=id;
      }

      public String getName(){
          return this.name;
      }
      public int getId(){
         return this.id;
         
      }
        }
public class Challenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Customer c1=new Customer(sc.next(),sc.nextInt());
        System.out.println(c1.getName());
        System.out.println(c1.getId());
        sc.close();
    }
    
}

