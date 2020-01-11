package src.forest;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import src.mortals.MainCharacter;

public class ForestStartGUI {
	Font buttonFont = new Font("Courier", Font.PLAIN, 30);

	JButton continueButton, yesButton, noButton;

	JPanel startPanel, namePanel, continueButtonPanel;
	JTextPane startArea;
	JTextArea characterNameArea;

	public void begin(JFrame window, ForestHandler fHandler) {
		// Temp
		namePanel = new JPanel();
		namePanel.setBounds(250, 300, 300, 80);
		namePanel.setBackground(Color.black);
		window.add(namePanel);
		
		startPanel = new JPanel();
		startPanel.setBounds(100, 100, 600, 250);
		startPanel.setBackground(Color.black);
		window.add(startPanel);

		continueButtonPanel = new JPanel();
		continueButtonPanel.setBounds(200, 400, 400, 200);
		continueButtonPanel.setBackground(Color.black);

		startArea = new JTextPane();
		startArea.setText("Human...");
		startArea.setBounds(200, 200, 500, 300);
		startArea.setBackground(Color.black);
		startArea.setForeground(Color.white);
		startArea.setFont(buttonFont);
		startArea.setEditable(false);
		startArea.setHighlighter(null);
		startArea.setSize(10, 10);
		startPanel.add(startArea);

		characterNameArea = new JTextArea();
		characterNameArea.setBounds(200, 200, 100, 300);
		characterNameArea.setBackground(Color.black);
		characterNameArea.setForeground(Color.white);
		characterNameArea.setFont(buttonFont);
		characterNameArea.setEditable(true);
		characterNameArea.setHighlighter(null);
		namePanel.add(characterNameArea);

		continueButton = new JButton(">");
		continueButton.setBackground(Color.black);
		continueButton.setForeground(Color.white);
		continueButton.setFont(buttonFont);
		continueButton.setActionCommand("C1");
		continueButton.addActionListener(fHandler);
		continueButton.setFocusPainted(false);
		
		yesButton = new JButton("Yes");
		yesButton.setBackground(Color.black);
		yesButton.setForeground(Color.white);
		yesButton.setFont(buttonFont);
		yesButton.setActionCommand("Yes");
		yesButton.addActionListener(fHandler);
		yesButton.setFocusPainted(false);
		
		noButton = new JButton("No");
		noButton.setBackground(Color.black);
		noButton.setForeground(Color.white);
		noButton.setFont(buttonFont);
		noButton.setActionCommand("No");
		noButton.addActionListener(fHandler);
		noButton.setFocusPainted(false);
		
		continueButtonPanel.add(continueButton);
		continueButtonPanel.add(yesButton);
		continueButtonPanel.add(noButton);
		
		window.add(continueButtonPanel);

		window.setVisible(true);
	}

}
