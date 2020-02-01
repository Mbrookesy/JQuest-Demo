package src.forest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.battle.BattleVisibilityManager;
import src.forest.ForestVisibilityManager;
import src.maingame.MainVisibilityManager;

public class ForestHandler implements ActionListener{	
	MainVisibilityManager ngvmMain;
	ForestVisibilityManager fvmMain;
	BattleVisibilityManager bvmMain;
	ForestMonster fmon;
	public ForestHandler(MainVisibilityManager ngvm, ForestVisibilityManager fvm, BattleVisibilityManager bvm, ForestMonster fmonAll) {
	ngvmMain = ngvm;
	fvmMain = fvm;
	bvmMain = bvm;
	fmon = fmonAll;
}

	public void actionPerformed(ActionEvent event) {
		String choice = event.getActionCommand();
		
		switch(choice) {
		case "C1": ngvmMain.ChangeText("You looks around and hear some weird fizzing sounds and decide to investigate.", "C2"); break;
		case "C2": ngvmMain.ChangeText("When you get closer suddenly...", "C3"); break;
		case "C3": ngvmMain.ChangeText("The fizzing attacks!", "C4"); break;
		case "C4": ngvmMain.hide(); bvmMain.enterBattle("Tutorial", fmon.demoMonster()); break;
		default: break;
		}
	}
}
