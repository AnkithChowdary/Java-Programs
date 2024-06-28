public class FewStringFunctions{
  public static void main(String[] args) {
    String word="Ankith101An001";
    word=word.replaceAll("\\D+","");
    System.out.println(word);
    String[] numbers = word.trim().split("\\s+");
    for(String x:numbers){
      System.out.println(x);
    }
  }
}