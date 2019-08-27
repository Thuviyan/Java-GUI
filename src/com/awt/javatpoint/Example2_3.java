package com.awt.javatpoint;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2_3 extends Frame{
	
	TextField tf;
	
	Example2_3(){
		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b = new Button("click me");
		b.setBounds(100, 120, 80, 30);
		
		Outer o = new Outer(this);
		b.addActionListener(o);
		
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Example2_3();

	}

	

}

class Outer implements ActionListener{
	
	Example2_3 obj;
	
	Outer(Example2_3 obj){
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		obj.tf.setText("Welcome");
		
	}
	
}
