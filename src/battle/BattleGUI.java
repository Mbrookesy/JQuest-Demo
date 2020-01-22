package src.battle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import src.main.LoadChar;
import src.mortals.MainCharacter;

public class BattleGUI {
	//Menu Panels
	JPanel titleNamePanel;
	JPanel ButtonPanel, DescPanel, HPPanel, MPPanel, ColaPanel, EnemyPanel, MoralPanel;
	JLabel HPLabel, MPLabel, ColaLabel, MoralLabel;
	Font statFont = new Font("Courier", Font.BOLD, 25);
	Font buttonFont = new Font("Courier", Font.PLAIN, 18);
	JButton attackButton, spellsButton, drinkButton, complimentButton, insultButton;	
	JTextArea desc;
	
	public void Battle(JFrame window, ArrayList<ActionListener> handlers) {
		
		DescPanel = new JPanel();
		DescPanel.setBounds(300, 330, 400, 125);
		DescPanel.setBackground(Color.black);
		DescPanel.setBorder(BorderFactory.createLineBorder(Color.white));
		
		desc = new JTextArea();
		desc.setText("Placeholder");
		desc.setBounds(5, 50, 50, 50);
		desc.setBackground(Color.black);
		desc.setForeground(Color.white);
		desc.setFont(buttonFont);
		desc.setEditable(false);
		desc.setHighlighter(null);
		desc.setSize(350, 350);
		desc.setLineWrap(true);
		desc.setWrapStyleWord(true);
		DescPanel.add(desc);
		
		EnemyPanel = new JPanel();
		EnemyPanel.setBounds(375, 200, 50, 50);
		EnemyPanel.setBackground(Color.red);
		
		MoralPanel = new JPanel();
		MoralPanel.setBounds(300, 480, 400, 50);
		MoralPanel.setBackground(Color.black);
		MoralPanel.setBorder(BorderFactory.createLineBorder(Color.white));
		MoralLabel = new JLabel("MORAL: " + LoadChar.mainChar.getMoral());
		MoralLabel.setFont(statFont);
		MoralLabel.setForeground(Color.white);
		MoralPanel.add(MoralLabel);
		
		HPPanel = new JPanel();
		HPPanel.setBounds(100, 50, 100, 50);
		HPPanel.setBackground(Color.black);
		HPLabel = new JLabel("HP: " + LoadChar.mainChar.getHp());
		HPLabel.setFont(statFont);
		HPLabel.setForeground(Color.white);
		HPPanel.add(HPLabel);
		
		
		MPPanel = new JPanel();
		MPPanel.setBounds(350, 50, 100, 50);
		MPPanel.setBackground(Color.black);
		MPLabel = new JLabel("JP: " + LoadChar.mainChar.getMana());
		MPLabel.setFont(statFont);
		MPLabel.setForeground(Color.white);
		MPPanel.add(MPLabel);
		
		ColaPanel = new JPanel();
		ColaPanel.setBounds(575, 50, 150, 50);
		ColaPanel.setBackground(Color.black);
		ColaLabel = new JLabel("Cola: " + LoadChar.mainChar.getCola());
		ColaLabel.setFont(statFont);
		ColaLabel.setForeground(Color.white);
		ColaPanel.add(ColaLabel);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(100, 325, 200, 225);
		ButtonPanel.setBackground(Color.black);
		
		attackButton = new JButton("Melee");
		attackButton.setBackground(Color.black);
		attackButton.setForeground(Color.white);
		attackButton.setFont(buttonFont);
		attackButton.addActionListener(handlers.get(2));
		attackButton.setActionCommand("New Game");
		attackButton.setPreferredSize(new Dimension(150, 36));
		attackButton.setFocusPainted(false);
		
		spellsButton = new JButton("Spells");
		spellsButton.setBackground(Color.black);
		spellsButton.setForeground(Color.white);
		spellsButton.setFont(buttonFont);
		spellsButton.addActionListener(handlers.get(2));
		spellsButton.setActionCommand("Load Game");
		spellsButton.setPreferredSize(new Dimension(150, 36));
		spellsButton.setFocusPainted(false);
		
		drinkButton = new JButton("Drink");
		drinkButton.setBackground(Color.black);
		drinkButton.setForeground(Color.white);
		drinkButton.setFont(buttonFont);
		drinkButton.addActionListener(handlers.get(2));
		drinkButton.setActionCommand("Help");
		drinkButton.setPreferredSize(new Dimension(150, 36));
		drinkButton.setFocusPainted(false);
		
		complimentButton = new JButton("Compliment");
		complimentButton.setBackground(Color.black);
		complimentButton.setForeground(Color.white);
		complimentButton.setFont(buttonFont);
		complimentButton.addActionListener(handlers.get(2));
		complimentButton.setActionCommand("Credits");
		complimentButton.setPreferredSize(new Dimension(150, 36));
		complimentButton.setFocusPainted(false);
		
		insultButton = new JButton("Insult");
		insultButton.setBackground(Color.black);
		insultButton.setForeground(Color.white);
		insultButton.setFont(buttonFont);
		insultButton.addActionListener(handlers.get(2));
		insultButton.setActionCommand("Exit");
		insultButton.setPreferredSize(new Dimension(150, 36));
		insultButton.setFocusPainted(false);
		
		ButtonPanel.add(attackButton);
		ButtonPanel.add(spellsButton);
		ButtonPanel.add(drinkButton);
		ButtonPanel.add(complimentButton);
		ButtonPanel.add(insultButton);
		
		window.add(HPPanel);
		window.add(MPPanel);
		window.add(DescPanel);
		window.add(ButtonPanel);
		window.add(ColaPanel);
		window.add(EnemyPanel);
		window.add(MoralPanel);
		
		window.setVisible(true);

	}
}
