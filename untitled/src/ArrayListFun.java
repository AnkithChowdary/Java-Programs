import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListFun {
    public static void main(String[] args){
        ArrayList<Integer>li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=1; i<=3;i++){
            li.add(sc.nextInt());
        }
        for(int k:li)
            System.out.println(k);

        //In specific position
        li.add(3,3);
        for(int k:li)
            System.out.println(k);
        for(int i=0; i<li.toArray().length;i++){
            System.out.println(li.get(i));
        }

    }
}
