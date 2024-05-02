package values;
import java.util.Scanner;
public class WithStaticVaribles {
    static int num;
    static String name;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        name=sc.next();
    }
}
