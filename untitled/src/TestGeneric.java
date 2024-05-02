public class TestGeneric {



  public static <E>void printArray(E[] elements){
for(E ele:elements){
  System.out.println(ele);
}
System.out.println();
  }
  public static void main(String[] args) {
    Integer []intArray={1,2,3,4,5};
    printArray(intArray);
    Character []c={'k','l','u'};
    printArray(c);

  }
}