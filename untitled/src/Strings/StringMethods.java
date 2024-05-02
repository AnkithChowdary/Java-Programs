package Strings;

import static java.util.Collections.replaceAll;

public class StringMethods {
    public static void main(String[] args) {
         String birthDate="05/5/2007";
         // To get the index
         int startingIndex=birthDate.indexOf("2007");

        System.out.println("StartingIndex= "+startingIndex);
        // printing substring with index
        System.out.println("Birth year = "+birthDate.substring(startingIndex));

        System.out.println("Month = "+birthDate.charAt(3));

        String newDate=String.join("-","05","5","2007");

        System.out.println("newDate = "+newDate+"\n");
        // String concatenation
        newDate="05";
        newDate=newDate.concat("/");
        newDate=newDate.concat("11");
        newDate=newDate.concat("/");
        newDate=newDate.concat("2007");
        System.out.println("newDate = "+newDate);
        //Method chaining
        newDate="05".concat("/").concat("11").concat("/").concat("2007");
        System.out.println("newDate = "+newDate);
        // Replace
        System.out.println("Replaced = "+newDate.replaceAll("/","-"));
        String name="Ankit";
        System.out.println("replaced = "+name.replace("n","N"));
        System.out.println("ReplaceFirst = "+newDate.replaceFirst("/","-"));
        System.out.println("-".repeat(25));
        System.out.println("ABC\n".repeat(3));
        System.out.println("ABC\n".repeat(3).indent(-2));
        System.out.println("_".repeat(10));



        String anc="ankith is good boy";
        String abc2=anc.replaceAll(" ","");
        System.out.println(abc2);
        abc2=abc2.toUpperCase();
        System.out.println(abc2);
    }
}
