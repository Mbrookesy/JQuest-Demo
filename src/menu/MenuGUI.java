package src.menu;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class MenuGUI {
	//Menu Panels
	JPanel titleNamePanel;
	JPanel ButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Courier", Font.BOLD, 90);
	Font buttonFont = new Font("Courier", Font.PLAIN, 30);
	JButton newGameButton, loadGameButton, helpButton, creditsButton, exitButton, battleButton;
	
	JButton backButton;
	
	//Credit Panels
	JPanel creditPanel, creditButtonPanel;
	JTextArea creditsTextArea;
	
	
	//Temp Panels
	JPanel tempPanel, tempButtonPanel;
	JTextArea tempTextArea;

	
	public void menuScreen(JFrame window, ActionListener menuHandler) {
		
		//Menu
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 50, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("JQUEST");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(200, 300, 400, 200);
		ButtonPanel.setBackground(Color.black);
		
		newGameButton = new JButton("NEW GAME");
		newGameButton.setBackground(Color.black);
		newGameButton.setForeground(Color.white);
		newGameButton.setFont(buttonFont);
		newGameButton.addActionListener(menuHandler);
		newGameButton.setActionCommand("New Game");
		newGameButton.setFocusPainted(false);
		
		loadGameButton = new JButton("LOAD GAME");
		loadGameButton.setBackground(Color.black);
		loadGameButton.setForeground(Color.white);
		loadGameButton.setFont(buttonFont);
		loadGameButton.addActionListener(menuHandler);
		loadGameButton.setActionCommand("Load Game");
		loadGameButton.setFocusPainted(false);
		
		helpButton = new JButton("HELP");
		helpButton.setBackground(Color.black);
		helpButton.setForeground(Color.white);
		helpButton.setFont(buttonFont);
		helpButton.addActionListener(menuHandler);
		helpButton.setActionCommand("Help");
		helpButton.setFocusPainted(false);
		
		creditsButton = new JButton("CREDITS");
		creditsButton.setBackground(Color.black);
		creditsButton.setForeground(Color.white);
		creditsButton.setFont(buttonFont);
		creditsButton.addActionListener(menuHandler);
		creditsButton.setActionCommand("Credits");
		creditsButton.setFocusPainted(false);
		
		exitButton = new JButton("EXIT");
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
		exitButton.setFont(buttonFont);
		exitButton.addActionListener(menuHandler);
		exitButton.setActionCommand("Exit");
		exitButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		ButtonPanel.add(newGameButton);
		ButtonPanel.add(loadGameButton);
		ButtonPanel.add(helpButton);
		ButtonPanel.add(creditsButton);
		ButtonPanel.add(exitButton);
		
		window.add(titleNamePanel);
		window.add(ButtonPanel);
		
		
		//Credits

		creditPanel = new JPanel();
		creditPanel.setBounds(100, 100, 600, 250);
		creditPanel.setBackground(Color.black);
		window.add(creditPanel);
		
		creditButtonPanel = new JPanel();
		creditButtonPanel.setBounds(200, 400, 400, 200);
		creditButtonPanel.setBackground(Color.black);
		
		creditsTextArea = new JTextArea("Created By: Mbrookesy\n" +  
				"Testing:\n" + 
				"Mbrookesy\n" + 
				"DreamcastKnight\n" + 
				"Malverick\n" +
				"Inspired By JH at QA\n");
		creditsTextArea.setBounds(100, 100, 600, 250);
		creditsTextArea.setBackground(Color.black);
		creditsTextArea.setForeground(Color.white);
		creditsTextArea.setFont(buttonFont);
		creditsTextArea.setLineWrap(true);
		creditsTextArea.setEditable(false);
		creditsTextArea.setHighlighter(null);
		creditPanel.add(creditsTextArea);
		
		backButton = new JButton("BACK");
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.white);
		backButton.setFont(buttonFont);
		backButton.addActionListener(menuHandler);
		backButton.setActionCommand("Back");
		
		creditButtonPanel.add(backButton);
		window.add(creditButtonPanel);
		
		//backButton
		
		//Temp
		tempPanel = new JPanel();
		tempPanel.setBounds(100, 100, 600, 250);
		tempPanel.setBackground(Color.black);
		window.add(tempPanel);
		
		tempButtonPanel = new JPanel();
		tempButtonPanel.setBounds(200, 400, 400, 200);
		tempButtonPanel.setBackground(Color.black);
		
		tempTextArea = new JTextArea("Not Availiable in Java Swing \nVersion");
		tempTextArea.setBounds(100, 100, 600, 250);
		tempTextArea.setBackground(Color.black);
		tempTextArea.setForeground(Color.white);
		tempTextArea.setFont(buttonFont);
		tempTextArea.setLineWrap(true);
		tempTextArea.setEditable(false);
		tempTextArea.setHighlighter(null);
		tempPanel.add(tempTextArea);
		
		backButton = new JButton("BACK");
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.white);
		backButton.setFont(buttonFont);
		backButton.addActionListener(menuHandler);
		backButton.setActionCommand("Back");
		
		tempButtonPanel.add(backButton);
		window.add(tempButtonPanel);
		
		window.setVisible(true);

	}
	
	


}
