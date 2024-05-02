package C2;

import java.awt.geom.Area;

class AreaOfSquare{
    int peri(int l,int b){
        return l*b;
    }
}
class PerimeterOfRectangle extends AreaOfSquare {
    int peri(int l,int b){
        return 2*(l+b);
    }
}
public class InheritArea {
    public static void main(String[] args) {
PerimeterOfRectangle obj=new PerimeterOfRectangle();
obj.peri(5,10);
    }
}
