package com.awt.javatpoint;

import java.awt.Button;
import java.awt.Frame;

public class Example1_3 {
	

	public static void main(String[] args) {
		Frame f=new Frame();
		Button b1 = new Button("click me");
		b1.setBounds(30, 100, 80, 30);
		f.add(b1);
		
		Button b2 = new Button("Test me");
		b2.setBounds(130, 100, 80, 30);
		f.add(b2);
		
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
