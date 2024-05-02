package GUIExamples;

import javax.swing.*;

public class G2 {
    public static void main(String[] args) {
        JFrame a=new JFrame("My gui 2");
        JScrollBar s=new JScrollBar();
        s.setBounds(80,90,100,100);
        a.add(s);
        a.setLayout(null);
        a.setVisible(true);
    }
}
