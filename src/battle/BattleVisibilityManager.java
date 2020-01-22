package src.battle;

import java.awt.Color;

import javax.swing.JFrame;

import src.main.GameGUI;
import src.mortals.Monster;

public class BattleVisibilityManager {
	BattleGUI battle;
	GameGUI game;
	JFrame windowScreen;
	
	public BattleVisibilityManager(GameGUI gamingscreen, BattleGUI userMenu, JFrame window) {
		game = gamingscreen;
		battle = userMenu;
		windowScreen = window;
	}
	public void enterBattleTutorial(String area, Monster monster) {
		//temp
		String battleText = " Manifested TO BE CONTINUED";
		
		battle.ButtonPanel.setVisible(true);
		battle.DescPanel.setVisible(true);
		battle.MPPanel.setVisible(true);
		battle.HPPanel.setVisible(true);
		battle.ColaPanel.setVisible(true);
		battle.EnemyPanel.setVisible(true);
		battle.MoralPanel.setVisible(true);
		windowScreen.getContentPane().setBackground(Color.black);
		
		if (area == "Tutorial") {
			battle.desc.setText(monster.getName() + battleText);
		}

	}
	public void hideall() {

		battle.ButtonPanel.setVisible(false);
		battle.DescPanel.setVisible(false);
		battle.MPPanel.setVisible(false);
		battle.HPPanel.setVisible(false);
		battle.ColaPanel.setVisible(false);
		battle.EnemyPanel.setVisible(false);
		battle.MoralPanel.setVisible(false);
	}


}
