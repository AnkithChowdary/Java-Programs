package Files;
import java.io.*;
public class FileDemo {
  public static void main(String[] args) throws Exception {
    FileInputStream fi=null;
    FileOutputStream fo=null;
    fi=new FileInputStream("D:\\Java-1\\untitled\\src\\Files\\Sem2.txt");
    fo=new FileOutputStream("D:\\Java-1\\untitled\\src\\Files\\Sem1.txt");
    int c;
    while((c=fi.read())!=-1){
      fo.write(c);
      System.out.println((char)c);
    //a quick brown fox runs over a lazy dog
    }
    fi.close();
    fo.close();
  }
}
