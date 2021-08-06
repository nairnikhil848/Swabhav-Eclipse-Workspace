package com.techlab.test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JButton button = new JButton();
		button.setText("Button");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Simple Button clicked.....");
			}

		});
		panel.add(button);

		JButton syncbutton = new JButton();
		syncbutton.setText("syncButton");
		syncbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				while (true) {
					System.out.println("Something to do with Sync....." + LocalTime.now().toString());
				}
			}

		});
		panel.add(syncbutton);

		JButton asyncbutton = new JButton();
		asyncbutton.setText("AsyncButton");
		asyncbutton.addActionListener(new AsyncListener() );
		panel.add(asyncbutton);

		frame.add(panel);

		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

class AsyncListener implements Runnable,ActionListener  {

	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Async Happening....." + LocalTime.now().toString());
		}
	}
	
}
