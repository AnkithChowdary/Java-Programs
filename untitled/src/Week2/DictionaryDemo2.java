//package Week2;
//
//import java.util.Scanner;
//
//public class DictionaryDemo2 {
//    static int i;
//    static Dictionary2[] arr = new Dictionary2[100];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name;
//        long mno;
//        int x = 1;
//        while (x != 0) {
//            System.out.println("Enter your choice\n 1.Add Details\n 2.Display\n 3.Exit");
//            int k = sc.nextInt();
//            switch (k) {
//                case 1:
//                    name = sc.next();
//                    mno = sc.nextLong();
//                    arr[i]=new Dictionary2(name,mno);
//
//                    i++;
//                    break;
//                case 2:
//                    for (int c = 0; c < i; c++) {
//                        System.out.println(arr[c].toString());
//                    }
//                    break;
//
//                case 3:
//                    x = 0;
//            }
//
//        }
//        sc.close();
//    }
//}
