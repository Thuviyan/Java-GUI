package com.awt.javatpoint;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2_2 extends Frame implements ActionListener{
	
	TextField tf;
	
	Example2_2(){
		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b = new Button("click me");
		b.setBounds(100, 120, 80, 30);
		
		b.addActionListener(this);
		
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Example2_2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
		
	}

}
