package presentation.TicTacToeGui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoardDetailsInputFrame extends JFrame implements ActionListener {
	JTextField p1TextField;
	JTextField p2TextField;
	JTextField boardSizeTextField;
	public BoardDetailsInputFrame(){
		
		this.setTitle("Details Frame");
		
		JLabel p1Label=new JLabel("Name of the Player 1:");
		p1TextField=new JTextField(15);
		
		JLabel p2Label=new JLabel("Name of the Player 2:");
		p2TextField=new JTextField(15);
		
		JLabel boardSizeLabel=new JLabel("Board Size :");
		boardSizeTextField=new JTextField(10);
		
		
	    JButton submitButton=new JButton("Submit");
	    submitButton.addActionListener(this);
	    
	    
	    JPanel panel = new JPanel(new GridLayout(4,1,5,5));
	    panel.add(p1Label);
	    panel.add(p1TextField);
	    panel.add(p2Label);
	    panel.add(p2TextField);
	    panel.add(boardSizeLabel);
	    panel.add(boardSizeTextField);
	    panel.add(submitButton);
	    
	    this.add(panel,BorderLayout.CENTER);
	    
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,200);
		//this.setResizable(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String p1Name = p1TextField.getText();
		String p2Name = p2TextField.getText();
		int boardSize = Integer.parseInt(boardSizeTextField.getText());
		
		TicTacToeFrame GameFrame = new TicTacToeFrame(p1Name,p2Name,boardSize);
		this.setVisible(false);
		GameFrame.setVisible(true);
		
		
		
	}
}
