//package Week2;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class DictionaryDemo {
//    public static void main(String[] args){
//        String name;
//        long mno;
//        ArrayList<Dictionary>a=new ArrayList<>();
//
//        Scanner sc=new Scanner(System.in);
//        int z=0;
//        while(z!=1) {
//            System.out.println("Enter Operation you want to perform:\n1.Add\n 2.Display\n3.Exit");
//            int k = sc.nextInt();
//            switch (k) {
//                case 1:
//                    name = sc.next();
//                    mno = sc.nextLong();
//                    a.add(new Dictionary(name, mno));
//                    break;
//                case 2:
//                    for (int i = 0; i < a.toArray().length; i++) {
//                        System.out.println(a.get(i));
//                    }
//                    break;
//                case 3:
//                    z=1;
//                    break;
//
//            }
//        }
//
//    }
//}
