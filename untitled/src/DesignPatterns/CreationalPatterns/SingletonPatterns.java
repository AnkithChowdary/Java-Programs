


public class SingletonPatterns {

  private static SingletonPatterns obj=new SingletonPatterns();

  private SingletonPatterns(){

  }
  static SingletonPatterns getInstance(){
    return obj;
  }
  
  public static void main(String[] args) {
      SingletonPatterns s=SingletonPatterns.getInstance();
      s.message();
  }

  void message(){
    System.out.println("This is singleton pattern");
  }
}
