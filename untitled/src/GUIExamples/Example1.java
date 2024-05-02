package GUIExamples;


import javax.swing.*;
public class Example1 {
	public static void main(String args[])
	{
		JFrame a= new JFrame("TUESDAY");
		JButton b=new JButton("hi jaffas");
		b.setBounds(170,186,300,300);
		a.add(b);
		a.setSize(150,150);
		a.setLayout(null);
		a.setVisible(true);
	}
}