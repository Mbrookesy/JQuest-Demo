package src.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.battle.BattleVisibilityManager;
import src.main.LoadChar;
import src.maingame.MainVisibilityManager;
import src.mortals.MainCharacter;

public class MenuHandler implements ActionListener{	
		MenuVisibilityManager vmMain;
		MainVisibilityManager ngvmMain;
		BattleVisibilityManager baMain;
		public MenuHandler(MenuVisibilityManager vm, MainVisibilityManager ngvm, BattleVisibilityManager bMain) {
		vmMain = vm;
		ngvmMain = ngvm;
		baMain = bMain;
	}

		public void actionPerformed(ActionEvent event) {
			String choice = event.getActionCommand();
			
			switch(choice) {
			case "New Game": vmMain.showNewGameScreen(); ngvmMain.show(); break;
			case "Load Game": vmMain.showTempScreen(); break;
			case "Help": vmMain.showTempScreen(); break;
			case "Credits": vmMain.showCreditsScreen(); break;
			case "Exit": System.exit(0); break;
			case "Back": vmMain.showTitleScreen(); break;
			default: break;
			}
		}
}
