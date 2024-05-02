package GUIExamples;
import javax.swing.*;
public class Example5{
JMenu menu;
JMenuItem a1, a2;
Example5()
{

JFrame a = new JFrame("MENU Example");
menu = new JMenu("Section Options");
JMenuBar m1 = new JMenuBar();
a1 = new JMenuItem("S15");
a2 = new JMenuItem("S22");
menu.add(a1);
menu.add(a2);
m1.add(menu);
a.setJMenuBar(m1);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
public static void main(String args[])
{
	new Example5();
}
}
