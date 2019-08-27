package com.swing.javatpoint;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example1_1 {

	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		JButton b= new JButton("Click");
		
		b.setBounds(140, 100, 100, 40);
		
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
