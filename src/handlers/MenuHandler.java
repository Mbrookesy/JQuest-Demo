package src.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.forest.ForestVisibilityManager;
import src.menu.VisibilityManager;

public class MenuHandler implements ActionListener{	
		VisibilityManager vmMain;
		ForestVisibilityManager fvmMain;
		public MenuHandler(VisibilityManager vm, ForestVisibilityManager fvm) {
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
