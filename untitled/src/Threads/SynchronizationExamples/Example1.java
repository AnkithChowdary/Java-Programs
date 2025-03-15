import java.util.*;

class Accounts{
  private String name;
  private int accountNumber;
  private int balance;
  private int pin;
  Accounts(String name,int accountNumber,int balance,int pin){
    this.name=name;
    this.accountNumber=accountNumber;
    this.balance=balance;
    this.pin=pin;
  }

   String getName(){
    return this.name;
   }

   int getaccountNumber(){
    return this.accountNumber;
   }

   int getBalance(){
    return this.balance;
   }
   int setBalance(int balance){
    this.balance=balance;
   }
   int getPin(){
    return this.pin;
   }


}

class Bank{
private List<Accounts>ls;
Bank(List<Accounts> ls){
this.ls=ls;
}
  public synchronized void withDrawUsingAtm(int accountNumber,int amount,int pin){
    for(Accounts acc:ls){
      if(acc.getaccountNumber()==accountNumber){
         if(acc.getPin()==pin){
          if(amount<acc.getBalance()){
            System.out.println("Insufficient balance");
          }else{
             int newBal=acc.getBalance()-amount;
          }
         }
      }
    }
  }

  public synchronized void withDrawUsingApp(int accountNumber,int amount,int pin){
    for(Accounts acc:ls){
      if(acc.getaccountNumber()==accountNumber){
         if(acc.getPin()==pin){
          if(amount<acc.getBalance()){
            System.out.println("Insufficient balance");
          }else{
             int newBal=acc.getBalance()-amount;
          }
         }
      }
    }
  }
}
class Account extends Thread{
    
}

public class Example1{
  public static void main(String []args){
List<Accounts> ls=new Arraylist<>();

ls.add(new Accounts("Trishal", 45576, 5000000, 1545));
ls.add(new Accounts("Ankith", 14445 ,10000, 9390));
Bank b=new Bank(ls);

Account a1=new Account()



    
  }
}