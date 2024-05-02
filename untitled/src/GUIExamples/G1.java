package GUIExamples;

import javax.swing.*;

public class G1 {
    public static void main(String[] args) {
        JFrame f=new JFrame("My first GUI Ex");
        JButton x=new JButton("Hi my name is ankith");
        x.setBounds(155,100,200,150);
        f.add(x);
        f.setSize(200,155);
        f.setLayout(null);
        f.setVisible(true);
    }
}
