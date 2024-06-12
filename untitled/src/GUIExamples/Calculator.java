package Graphic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4, b5;
    Calculator() {
        f = new JFrame("Calculator Application");
        l1 = new JLabel("Input 1:");
        l2 = new JLabel("Input 2:");
        l3 = new JLabel("Output :");

        t1 = new JTextField(10);
         t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MUL");
        b4 = new JButton("DIV");
        b5 = new JButton("MOD");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
        f.pack();
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0; // Result variable

        if (e.getSource() == b1) {
            c = a+b;
        } else if (e.getSource() == b2) {

            c = a-b;
        } else if (e.getSource() == b3) {
            c = a*b;
        } else if (e.getSource() == b4) {
            c = a/b;
        } else if (e.getSource() == b5) {
            c = a%b;
        }

        t3.setText(Integer.toString(c)); // Set the result in the output field
    }

    // Function to perform addition


    // Function to perform modulo



    public static void main(String[] args) {
        new Calculator();
    }
}
