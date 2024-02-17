

public class ArrayCmd {
    public static void main(String[] args){
        int s=0;
        for(String k:args){
            s+=Integer.parseInt(k);
        }
        System.out.println(s);
    }
}
