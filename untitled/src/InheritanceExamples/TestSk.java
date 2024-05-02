package InheritanceExamples;

class CollegeSk{
    String msgsk="Get Admitted";

}
class BranchSk extends CollegeSk{
    String msgsk="Select branch";
    void status(){
        System.out.println(msgsk);
        System.out.println(super.msgsk);
    }
}
public class TestSk {
    public static void main(String[] args) {
        BranchSk b=new BranchSk();
        b.status();
    }
}
