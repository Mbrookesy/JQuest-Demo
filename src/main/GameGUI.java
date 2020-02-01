package src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameGUI {
	Font buttonFont = new Font("Courier", Font.PLAIN, 30);

	private JButton continueButton;

	private JButton yesButton;

	private JButton noButton;

	private JPanel startPanel;

	private JPanel namePanel;

	private JPanel continueButtonPanel;
	private JTextArea startArea;
	
	JTextArea characterNameArea;

	public void begin(JFrame window, ArrayList<ActionListener> handlers) {
		// Temp
		setNamePanel(new JPanel());
		getNamePanel().setBounds(250, 300, 300, 80);
		getNamePanel().setBackground(Color.black);
		window.add(getNamePanel());
		
		setStartPanel(new JPanel());
		getStartPanel().setBounds(100, 100, 600, 250);
		getStartPanel().setBackground(Color.black);
		window.add(getStartPanel());

		setContinueButtonPanel(new JPanel());
		getContinueButtonPanel().setBounds(200, 400, 400, 200);
		getContinueButtonPanel().setBackground(Color.black);
		
		setStartArea(new JTextArea());
		getStartArea().setText("Human...");
		getStartArea().setBounds(200, 200, 500, 300);
		getStartArea().setBackground(Color.black);
		getStartArea().setForeground(Color.white);
		getStartArea().setFont(buttonFont);
		getStartArea().setEditable(false);
		getStartArea().setHighlighter(null);
		getStartArea().setSize(500, 500);
		getStartArea().setLineWrap(true);
		getStartArea().setWrapStyleWord(true);
		getStartPanel().add(getStartArea());

		characterNameArea = new JTextArea();
		getCharacterNameArea().setBounds(200, 200, 100, 300);
		getCharacterNameArea().setBackground(Color.black);
		getCharacterNameArea().setForeground(Color.white);
		getCharacterNameArea().setFont(buttonFont);
		getCharacterNameArea().setEditable(true);
		getCharacterNameArea().setHighlighter(null);
		getNamePanel().add(getCharacterNameArea());

		setContinueButton(new JButton(">"));
		getContinueButton().setBackground(Color.black);
		getContinueButton().setForeground(Color.white);
		getContinueButton().setFont(buttonFont);
		getContinueButton().setActionCommand("C1");
		getContinueButton().addActionListener(handlers.get(1));
		getContinueButton().setFocusPainted(false);
		
		setYesButton(new JButton("Yes"));
		getYesButton().setBackground(Color.black);
		getYesButton().setForeground(Color.white);
		getYesButton().setFont(buttonFont);
		getYesButton().setActionCommand("Yes");
		getYesButton().addActionListener(handlers.get(1));
		getYesButton().setFocusPainted(false);
		
		setNoButton(new JButton("No"));
		getNoButton().setBackground(Color.black);
		getNoButton().setForeground(Color.white);
		getNoButton().setFont(buttonFont);
		getNoButton().setActionCommand("No");
		getNoButton().addActionListener(handlers.get(1));
		getNoButton().setFocusPainted(false);
		
		getContinueButtonPanel().add(getContinueButton());
		getContinueButtonPanel().add(getYesButton());
		getContinueButtonPanel().add(getNoButton());
		
		window.add(getContinueButtonPanel());

		window.setVisible(true);
	}

	public JPanel getContinueButtonPanel() {
		return continueButtonPanel;
	}

	public void setContinueButtonPanel(JPanel continueButtonPanel) {
		this.continueButtonPanel = continueButtonPanel;
	}

	public JPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(JPanel startPanel) {
		this.startPanel = startPanel;
	}

	public JButton getContinueButton() {
		return continueButton;
	}

	public void setContinueButton(JButton continueButton) {
		this.continueButton = continueButton;
	}

	public JButton getNoButton() {
		return noButton;
	}

	public void setNoButton(JButton noButton) {
		this.noButton = noButton;
	}

	public JButton getYesButton() {
		return yesButton;
	}

	public void setYesButton(JButton yesButton) {
		this.yesButton = yesButton;
	}

	public JPanel getNamePanel() {
		return namePanel;
	}

	public void setNamePanel(JPanel namePanel) {
		this.namePanel = namePanel;
	}

	public JTextArea getCharacterNameArea() {
		return characterNameArea;
	}

	public JTextArea getStartArea() {
		return startArea;
	}

	public void setStartArea(JTextArea jTextArea) {
		this.startArea = jTextArea;
	}

}
