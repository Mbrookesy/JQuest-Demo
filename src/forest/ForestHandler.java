package src.forest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.main.LoadChar;
import src.menu.MenuVisibilityManager;
import src.mortals.MainCharacter;

public class ForestHandler implements ActionListener{	
	ForestVisibilityManager fvmMain;
	public ForestHandler(ForestVisibilityManager fvm) {
	fvmMain = fvm;
}

	public void actionPerformed(ActionEvent event) {
		String choice = event.getActionCommand();
		
		switch(choice) {
		case "C1": fvmMain.ChangeText("What is your name?", "C2"); fvmMain.showNameField(); break;
		case "C2": if (fvmMain.getName().equalsIgnoreCase("Jordan")) {fvmMain.ChangeText("Ah Jordan good...", "C3"); }
				   else {fvmMain.ChangeText("I sense something wrong... \n  did you mean Jordan?", ""); fvmMain.showYesNo(); }
			       fvmMain.hideNameField(); break;
		case "C3": fvmMain.ChangeText("I'm glad you already know\n  a bit about yourself", "C4"); break;
		case "C4": fvmMain.ChangeText("There is much to learn...\nbut for now we must get you\nout of the forest...", "WakeUp"); fvmMain.wakeUpButton(); break;
		case "Yes": fvmMain.ChangeText("Ah great! must of been a mistake", "C4"); fvmMain.showContinue(); break;
		case "No": fvmMain.ChangeText("Well.. to make things easy\nI'll just call you Jordan", "C4"); fvmMain.showContinue(); break;
		default: break;
		}
	}
}
