package com.techlab.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeBackgroundFrame {
	public ChangeBackgroundFrame() {
		JFrame f = new JFrame("Button Example");
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		JButton r = new JButton("Red");
		r.setBounds(50, 100, 95, 30);
		r.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.getContentPane().setBackground(Color.red);
			}
		});

		JButton b = new JButton("Blue");
		b.setBounds(50, 140, 95, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.getContentPane().setBackground(Color.blue);
			}
		});

		// f.getContentPane().setLayout(new FlowLayout());
		f.add(b);
		f.add(r);
	}
}
