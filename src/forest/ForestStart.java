package src.forest;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import src.handlers.ForestHandler;
import src.mortals.MainCharacter;

public class ForestStart {
	//Menu Panels
	JPanel titleNamePanel;
	JPanel ButtonPanel;
	JLabel titleNameLabel;
	Font titleFont = new Font("Courier", Font.BOLD, 90);
	Font buttonFont = new Font("Courier", Font.PLAIN, 30);
	JButton newGameButton, loadGameButton, helpButton, creditsButton, exitButton;
	
	JButton continueButton;
	
	//Credit Panels
	JPanel creditPanel, creditButtonPanel;
	JTextArea creditsTextArea;
	
	
	//Temp Panels
	JPanel startPanel, continueButtonPanel;
	JTextArea startArea;
	
	public void begin(JFrame window, ForestHandler fHandler) {
		//Temp
				startPanel = new JPanel();
				startPanel.setBounds(100, 100, 600, 250);
				startPanel.setBackground(Color.black);
				window.add(startPanel);
				
				continueButtonPanel = new JPanel();
				continueButtonPanel.setBounds(200, 400, 400, 200);
				continueButtonPanel.setBackground(Color.black);
				
				startArea = new JTextArea();
				startArea.setText("Human...");
				startArea.setBounds(200, 200, 100, 300);
				startArea.setBackground(Color.black);
				startArea.setForeground(Color.white);
				startArea.setFont(buttonFont);
				startArea.setEditable(false);
				startArea.setHighlighter(null);
				startPanel.add(startArea);
				
				continueButton = new JButton(">");
				continueButton.setBackground(Color.black);
				continueButton.setForeground(Color.white);
				continueButton.setFont(buttonFont);
				continueButton.setActionCommand("C1");
				continueButton.addActionListener(fHandler);
				continueButtonPanel.add(continueButton);
				window.add(continueButtonPanel);
				
				window.setVisible(true);
		
		//System.out.println("Human....");
		//sc.nextLine();
		//System.out.println("What is your name?");
		//String name = sc.nextLine();
		//if (name.equalsIgnoreCase("Jordan")) {
		//	System.out.println("Ah Jordan good...");
		//}	else  {
		//	System.out.println("I sense something wrong... did you mean Jordan?...(Y/N)");
		//	sc.nextLine();
		//	System.out.print("Ah Jordan good...");
		//}
		//MainCharacter mainChar = new MainCharacter("Jordan");
		//System.out.println("Hello Jordan let us begin...");
		//sc.nextLine();
		//System.out.println("There is much to learn... but for now we must get you out of the forest...");
		//sc.nextLine();
		//return mainChar;
	}

}
