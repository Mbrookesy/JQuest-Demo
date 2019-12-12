package src.spells;

import java.util.ArrayList;

public class SpellBook {
	ArrayList<SpellBuilder> spellbook = new ArrayList<SpellBuilder>();
	public ArrayList<SpellBuilder> startingSpells() {
		
		spellbook.add(pepsiShaker);
		spellbook.add(beardStroker);
		return spellbook;
	}
	
	public SpellBuilder castSpell(int choice) {
		return null;
	}
	
	public ArrayList<SpellBuilder> getSpellBook() {
		return spellbook;
	}
		
	SpellBuilder pepsiShaker = new SpellBuilder(1,"Pepsi Shaker", 2, 8, 80);
	SpellBuilder beardStroker = new SpellBuilder(2,"Beard Stroker", 3, 10, 90);
	SpellBuilder penThrower = new SpellBuilder(3,"Pen Thrower", 5, 15, 80);
	
}
