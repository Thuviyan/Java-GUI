package com.awt.javatpoint;

import java.awt.Button;
import java.awt.Frame;

public class Example1_2 {
	
	public Example1_2() {
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

	public static void main(String[] args) {
		Example1_2 e= new Example1_2();

	}

}
