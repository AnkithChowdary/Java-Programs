import java.util.*;

class Stock{
  int quantity=20;
  void buy(){
System.out.println("Buying stocks");
  }
  void sell(){
System.out.println("Selling stocks");
  }
}

interface Order{
  void execute();
  
}

class BuyStocks implements Order{
  private Stock order;
  public BuyStocks(Stock order){
    this.order=order;
  }
   public void execute(){
     order.buy();
   }

}

class SellStocks implements Order{
  private Stock order;
  public SellStocks(Stock order){
    this.order=order;
  }
   public void execute(){
     order.sell();
   }

}

class Broker{
  private Order o;
  ArrayList<Order>orders=new ArrayList<Order>();
  void takeOrder(Order o){
   orders.add(o);
  }

  void placeOrder(){
    for(Order order:orders){
      order.execute();
    }
    orders.clear();
  }
}




public class CommandPattern {
  public static void main(String[] args) {
    Stock s=new Stock();
    BuyStocks by=new BuyStocks(s);
    SellStocks sl=new SellStocks(s);
    Broker b=new Broker();
    b.takeOrder(sl);
    b.takeOrder(by);
    b.placeOrder();
  

  }
}
