public class FunctionExamples {

  public static int randomNumber() {
      return (int) (Math.random() * 100);
  }

  public static void main(String[] args) {
      int randomNumber = randomNumber();
      System.out.println("Random Number: " + randomNumber);
  }
}
