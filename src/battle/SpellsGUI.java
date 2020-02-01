package src.battle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import src.spells.SpellBook;
import src.spells.SpellBuilder;

public class SpellsGUI {
	//Menu Panels
	JPanel titleNamePanel;
	JPanel ButtonPanel, DescPanel;
	JLabel SelectLabel;
	Font buttonFont = new Font("Courier", Font.PLAIN, 25);
	Font ListFont = new Font("Courier", Font.PLAIN, 20);
	JButton backButton, selectButton;
	JTextArea desc;
	JList<SpellBuilder> SpellsList;
	String selected;

	public void Battle(JFrame window, ActionListener handler) {
		
		SpellBuilder[] spells = new SpellBook().startingSpells();
		
		SpellsList = new JList<SpellBuilder>(spells);
		
		SpellsList.setFont(ListFont);
		SpellsList.setSelectedIndex(0);
		
		SelectLabel = new JLabel();
		SelectLabel.setFont(buttonFont);
		SelectLabel.setForeground(Color.white);
		SelectLabel.setText(SpellsList.getSelectedValue().selectionSpell());
		
		SpellsList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				SelectLabel.setText(SpellsList.getSelectedValue().selectionSpell());
			}
		});
		
		DescPanel = new JPanel();
		DescPanel.setBounds(50, 50, 675, 300);
		DescPanel.setBackground(Color.black);
		DescPanel.setBorder(BorderFactory.createLineBorder(Color.white));
		DescPanel.add(SpellsList);
		DescPanel.add(SelectLabel);
		
		backButton = new JButton("Back");
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.white);
		backButton.setFont(buttonFont);
		backButton.addActionListener(handler);
		backButton.setActionCommand("Back");
		backButton.setPreferredSize(new Dimension(150, 50));
		backButton.setFocusPainted(false);
		
		selectButton = new JButton("Select");
		selectButton.setBackground(Color.black);
		selectButton.setForeground(Color.white);
		selectButton.setFont(buttonFont);
		selectButton.addActionListener(handler);
		selectButton.setActionCommand("Select");
		selectButton.setPreferredSize(new Dimension(150, 50));
		selectButton.setFocusPainted(false);
		
		ButtonPanel = new JPanel();
		ButtonPanel.setBounds(280, 375, 200, 225);
		ButtonPanel.setBackground(Color.black);
		
		ButtonPanel.add(selectButton);
		ButtonPanel.add(backButton);
		
		
		window.add(DescPanel);
		window.add(ButtonPanel);
		
		window.setVisible(true);

	}
	
	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}
	
	
}
