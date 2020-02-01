package src.battle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import src.main.LoadChar;

public class BattleGUI {
	//Menu Panels
	JPanel titleNamePanel;
	JPanel ButtonPanel, DescPanel, HPPanel, MPPanel, EnemyPanel;
	JLabel HPLabel, MPLabel, ColaLabel;
	Font statFont = new Font("Courier", Font.BOLD, 25);
	Font buttonFont = new Font("Courier", Font.PLAIN, 18);
	JButton attackButton, spellsButton, drinkButton;
	JTextArea desc;
	
	public void Battle(JFrame window, ActionListener handler) {
		
		DescPanel = new JPanel();
		DescPanel.setBounds(300, 380, 400, 125);
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
		
		HPPanel = new JPanel();
		HPPanel.setBounds(100, 50, 100, 50);
		HPPanel.setBackground(Color.black);
		HPLabel = new JLabel("HP: " + LoadChar.mainChar.getHp());
		HPLabel.setFont(statFont);
		HPLabel.setForeground(Color.white);
		HPPanel.add(HPLabel);
		
		
		MPPanel = new JPanel();
		MPPanel.setBounds(575, 50, 150, 50);
		MPPanel.setBackground(Color.black);
		MPLabel = new JLabel("JP: " + LoadChar.mainChar.getMana());
		MPLabel.setFont(statFont);
		MPLabel.setForeground(Color.white);
		MPPanel.add(MPLabel);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(100, 375, 200, 225);
		ButtonPanel.setBackground(Color.black);
		
		attackButton = new JButton("Melee");
		attackButton.setBackground(Color.black);
		attackButton.setForeground(Color.white);
		attackButton.setFont(buttonFont);
		attackButton.addActionListener(handler);
		attackButton.setActionCommand("Melee");
		attackButton.setPreferredSize(new Dimension(150, 50));
		attackButton.setFocusPainted(false);
		
		spellsButton = new JButton("Spells");
		spellsButton.setBackground(Color.black);
		spellsButton.setForeground(Color.white);
		spellsButton.setFont(buttonFont);
		spellsButton.addActionListener(handler);
		spellsButton.setActionCommand("Spells");
		spellsButton.setPreferredSize(new Dimension(150, 50));
		spellsButton.setFocusPainted(false);
		
		ButtonPanel.add(attackButton);
		ButtonPanel.add(spellsButton);
		
		window.add(HPPanel);
		window.add(MPPanel);
		window.add(DescPanel);
		window.add(ButtonPanel);
		window.add(EnemyPanel);
		
		window.setVisible(true);

	}
}
