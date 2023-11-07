public class StringMethods {
    public static void main(String[] args) {
         String birthDate="05/5/2007";
         int startingIndex=birthDate.indexOf("2007");
        System.out.println("StartingIndex= "+startingIndex);
        System.out.println("Birth year = "+birthDate.substring(startingIndex));
    }
}
