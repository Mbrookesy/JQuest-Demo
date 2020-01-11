package src.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.forest.ForestVisibilityManager;
import src.main.LoadChar;
import src.mortals.MainCharacter;

public class MenuHandler implements ActionListener{	
		MenuVisibilityManager vmMain;
		ForestVisibilityManager fvmMain;
		public MenuHandler(MenuVisibilityManager vm, ForestVisibilityManager fvm) {
		vmMain = vm;
		fvmMain = fvm;
	}

		public void actionPerformed(ActionEvent event) {
			String choice = event.getActionCommand();
			
			switch(choice) {
			case "New Game": vmMain.showNewGameScreen(); fvmMain.showForestBegin(); break;
			case "Load Game": vmMain.showTempScreen(); break;
			case "Help": vmMain.showTempScreen(); break;
			case "Credits": vmMain.showCreditsScreen(); break;
			case "Exit": System.exit(0); break;
			case "Back": vmMain.showTitleScreen(); break;
			default: break;
			}
		}
}
