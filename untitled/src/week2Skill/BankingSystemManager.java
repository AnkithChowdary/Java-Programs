package week2Skill;

public class BankingSystemManager {
  private static BankingSystemManager bm;
  private BankingSystemManager(){}
  public static BankingSystemManager getInstance(){
    if(bm==null)
       bm=new BankingSystemManager();
       return bm;
  }
  public int accountBalance(){
    return 10000;
  }
  public String accountTransactions(){
    return "Transferred 2000 to accoount xyz \n Transferred 1000 to account abc";
  }
  public static void main(String []args){
    BankingSystemManager b=BankingSystemManager.getInstance();
    System.out.println("Account balance is: "+b.accountBalance());
    System.out.println("Account Transactions: "+b.accountTransactions());

  }

}
