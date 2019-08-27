package com.awt.javatpoint;

import java.awt.Button;
import java.awt.Frame;

public class Example1_1 extends Frame{
	
	public Example1_1() {
		Button b1 = new Button("click me");
		b1.setBounds(30, 100, 80, 30);
		add(b1);
		
		Button b2 = new Button("Test me");
		b2.setBounds(130, 100, 80, 30);
		add(b2);
		
		setSize(400,300);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Example1_1 e= new Example1_1();

	}

}
