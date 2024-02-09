import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        int length=40,height=41,breadth=70;
        int res=form(length,breadth,height);
        System.out.println(form(length,breadth,height));
    }
    public static int form(int length ,int breadth,int height){
        return (length*breadth*height);
    }
}
