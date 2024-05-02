package GUIExamples;

import javax.swing.*;
public class Example8{

JFrame a;
Example8()
{


a = new JFrame("ComboBox Example");
String[] courses= {"CTOOD", "DS","MFC"};
JComboBox c = new JComboBox(courses) ;
c.setBounds(40,40,90,20);
a.add(c);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
public static void main(String args[]){

new Example8();

}

}