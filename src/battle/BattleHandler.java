package src.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleHandler implements ActionListener{	
	BattleVisibilityManager bvmMain;
	public BattleHandler(BattleVisibilityManager bvm) {
	bvmMain = bvm;
}

	public void actionPerformed(ActionEvent event) {
		String choice = event.getActionCommand();
		
		switch(choice) {
		case "":
		default: break;
		}
	}
}

