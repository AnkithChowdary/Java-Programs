package exceptionexamples;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) throws IOException {

      FileWriter myFile = new FileWriter("D:\\Movies\\new.txt");
      myFile.write("Hi my name is ankith");
    myFile.close();
      FileReader myRead=new FileReader("D:\\Movies\\new.txt");
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextLine()){
      String d=sc.nextLine();



      System.out.println(d);
    }




    
  }
}
