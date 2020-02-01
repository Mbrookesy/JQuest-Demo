package src.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.spells.SpellBuilder;

public class BattleHandler implements ActionListener{	
	BattleVisibilityManager bvmMain;
	public BattleHandler(BattleVisibilityManager bvm) {
	bvmMain = bvm;
}

	public void actionPerformed(ActionEvent event) {
		String choice = event.getActionCommand();
		
		switch(choice) {
		case "Melee": bvmMain.melee(); break;
		case "Spells": bvmMain.spellMenu();  break;
		case "Back": bvmMain.battleMenu(); break;
		case "Select": SpellBuilder selectedSpell = bvmMain.getSpell(); 
		if (bvmMain.JPCheck(selectedSpell)) {bvmMain.battleMenu(); bvmMain.spell(selectedSpell); break;
			
		}else { break;
		}
		
		default: break;
		}
	}
}

