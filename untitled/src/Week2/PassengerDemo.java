package Week2;
import java.util.Scanner;
public class PassengerDemo {
    static Passengers []arr=new Passengers[100];
    static int i;

    public static void main(String[] args) {
        int x=1,d;
        String n;
        long mno;

        Scanner sc=new Scanner(System.in);
        while(x!=0){
            System.out.println(" 1.Add\n 2.Display\n 3.Exit");
            int b=sc.nextInt();
            switch(b){
                case 1:
                    n=sc.next();
                    mno=sc.nextLong();
                    d=sc.nextInt();
                    arr[i]=new Passengers(n,mno,d);
                    i++;
                    break;
                case 2:
                    for(int s=0; s<i;s++){
                        System.out.println(arr[i].toString());
                    }
                    break;
                case 3:
                    x=0;
                    break;
            }
        }
    }
}
