package GUIExamples;

import javax.swing.*;
public class Example3 {
	Example3()
	{
		JFrame a=new JFrame("JSrollBar Example");
		JScrollBar b=new JScrollBar();
		b.setBounds(90,90,40,90);
		a.add(b);
		a.setSize(300,300);
		a.setLayout(null);
		a.setVisible(true);
	}
	public static void main(String args[])
	{
		new Example3();
	}
}
