package GUIExamples;

import javax.swing.*;
public class Example2 {
	public static void main(String args[])
	{
		JFrame a=new JFrame("TEXTFIELD EXAMPLE");
		JTextField b=new JTextField("Hello");
		b.setBounds(50,100,200,30);
		a.add(b);
		a.setSize(300,300);
		a.setLayout(null);
		a.setVisible(true);
	}
}
