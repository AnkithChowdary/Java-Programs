package GUIExamples;
import javax.swing.*;

public class Example6
{
Example6()
{
JFrame a = new JFrame("JLIST Example");
DefaultListModel<String> l = new DefaultListModel< >();
l.addElement("CSE");
l.addElement("MECH");
JList<String> b = new JList< >(l);
b.setBounds(100,100, 75,75);
a.add(b);
a.setSize(400,400);
a.setVisible(true);
a.setLayout(null);
}

public static void main(String args[])
{
	new Example6();
}
}