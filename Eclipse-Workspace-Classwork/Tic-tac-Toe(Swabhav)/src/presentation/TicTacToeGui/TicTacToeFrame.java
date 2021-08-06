package presentation.TicTacToeGui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import services.Board;
import services.CellAlreadyMarkedException;
import services.Game;
import services.Mark;
import services.Player;
import services.Result;
import services.ResultAnalyzer;

public class TicTacToeFrame extends JFrame implements ActionListener {

	private List<JButton> buttonList;
	private ResultAnalyzer analyser;
	private JTextField player;
	private Game game;
	private JTextField status;
	private JPanel buttonLayout;
	private JButton resetButton;
	private Board board;
	private List<Player> players;

	public TicTacToeFrame(String player1, String player2, int boardSize) {

		board = new Board(boardSize);
		players = new ArrayList<Player>();
		Player p1 = new Player(player1, Mark.X);
		Player p2 = new Player(player2, Mark.O);
		players.add(p1);
		players.add(p2);
		analyser = new ResultAnalyzer(board, players);
		game = new Game(board, analyser, players);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Tic Tac Toe Game");
		this.setSize(700, 700);
		this.setLayout(new BorderLayout());

		JPanel header = new JPanel();
		header.setLayout(new FlowLayout());
		JLabel label = new JLabel("Current Player: ");
		header.add(label,FlowLayout.LEFT);
		player = new JTextField(game.getCurrentPlayer().getName().toString(),7);
		header.add(player);
		header.add(Box.createHorizontalStrut(30));
		JLabel label1 = new JLabel("Status: ");
		header.add(label1);
		status = new JTextField(analyser.checkWinner().toString(),7);
		header.add(status);
		header.add(Box.createHorizontalStrut(100));
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		header.add(resetButton);
		this.add(header, BorderLayout.NORTH);

		this.add(createButtons(), BorderLayout.CENTER);
		this.setVisible(true);

	}

	public JPanel createButtons() {
		buttonLayout = new JPanel();
		buttonLayout.setLayout(new GridLayout(board.getSize(), board.getSize()));
		buttonList = new ArrayList<JButton>();
		for (int i = 0; i < board.getSize() * board.getSize(); i++) {
			JButton button = new JButton(Integer.toString(i));
			button.addActionListener(this);
			buttonList.add(button);
			buttonLayout.add(button);
		}
		return buttonLayout;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == resetButton) {
			this.remove(buttonLayout);
			this.add(createButtons(), BorderLayout.CENTER);

			this.add(buttonLayout, BorderLayout.CENTER);

			board.resetBoard();
			game = new Game(board, analyser, players);
			player.setText(game.getCurrentPlayer().getName().toString());
			status.setText(analyser.checkWinner().toString());
			this.repaint();
			this.validate();
			return;

		}

		buttonList.get(Integer.parseInt(e.getActionCommand())).setText(game.getCurrentPlayer().getMark().toString());

		try {
			game.play(Integer.parseInt(e.getActionCommand()));
		} catch (NumberFormatException e1) {

			JOptionPane.showMessageDialog(this, "Hello");

		} catch (CellAlreadyMarkedException e1) {

			JOptionPane.showMessageDialog(this, e1.getLocalizedMessage());

		}
		if (analyser.checkWinner() == Result.Won) {
			status.setText(analyser.checkWinner().toString());
			disableButton();
			JOptionPane.showMessageDialog(this,
					"Congratulations :" + game.getCurrentPlayer().getName() + " has Won!Thanks for Playing.");
			return;

		}

		if (analyser.checkWinner() == Result.Draw) {
			status.setText("Draw");
			player.setText("");
			disableButton();
			JOptionPane.showMessageDialog(this, "The Game is a Tie! Thanks for playing");
			return;
		}

		player.setText(game.getCurrentPlayer().getName().toString());
		return;

	}

	private void disableButton() {
		for (JButton button : buttonList) {
			button.setEnabled(false);
		}
	}

}
