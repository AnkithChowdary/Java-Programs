package exceptionexamples;
class CustomExc extends Exception{
    public CustomExc(String s){
        super(s);
    }
}
public class Ex2Custom {
    public static void main(String[] args) {
        try {
            int t = 12;
            int c = 50;
            if (t < 20 && c < 70) {
                throw new CustomExc("Not eligible");
            }
            }catch(CustomExc e){
                System.err.println(e.getMessage());
            }

        }
    }

