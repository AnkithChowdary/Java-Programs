class dev{
    public static int form(int length ,int breadth,int height){
        return (length*breadth*height);
    }
}
public class CuboidSub {
    public static void main(String[] args) {
        int length=40,height=41,breadth=70;
        int res=dev.form(length,breadth,height);
        System.out.println(res);
    }
}

