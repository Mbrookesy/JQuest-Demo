package src.handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.forest.ForestVisibilityManager;
import src.menu.VisibilityManager;

public class ForestHandler implements ActionListener{	
	ForestVisibilityManager fvmMain;
	public ForestHandler(ForestVisibilityManager fvm) {
	fvmMain = fvm;
}

	public void actionPerformed(ActionEvent event) {
		
		String choice = event.getActionCommand();
		
		switch(choice) {
		case "C1": fvmMain.ChangeText("What is your name?", "C2"); break;
		case "C2": fvmMain.ChangeText("TBC in a future Update", "C3");
		default: break;
		}
	}
}
