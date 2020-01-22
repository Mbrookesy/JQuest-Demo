package src.maingame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.forest.ForestVisibilityManager;

public class MainHandler implements ActionListener{	
	MainVisibilityManager ngvmMain;
	ForestVisibilityManager fvmMain;
	public MainHandler(MainVisibilityManager ngvm, ForestVisibilityManager fvm) {
	ngvmMain = ngvm;
	fvmMain = fvm;
}

	public void actionPerformed(ActionEvent event) {
		String choice = event.getActionCommand();
		
		switch(choice) {
		case "C1": ngvmMain.ChangeText("What is your name?", "C2"); ngvmMain.showNameField(); break;
		case "C2": if (ngvmMain.getName().equalsIgnoreCase("Jordan")) {ngvmMain.ChangeText("Ah Jordan good...", "C3"); }
				   else {ngvmMain.ChangeText("I sense something wrong... did you mean Jordan?", ""); ngvmMain.showYesNo(); }
			       ngvmMain.hideNameField(); break;
		case "C3": ngvmMain.ChangeText("I'm glad you already know a bit about yourself", "C4"); break;
		case "C4": ngvmMain.ChangeText("There is much to learn... but for now we must get you out of the forest...", "WakeUp"); ngvmMain.wakeUpButton(); break;
		case "Yes": ngvmMain.ChangeText("Ah great! must've been a mistake", "C4"); ngvmMain.showContinue(); break;
		case "No": ngvmMain.ChangeText("Well.. to make things easy I'll just call you Jordan", "C4"); ngvmMain.showContinue(); break;
		case "WakeUp": fvmMain.firstEnteringForest(); break;
		default: break;
		}
	}
}
