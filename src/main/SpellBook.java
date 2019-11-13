package src.main;

import java.util.ArrayList;

public class SpellBook {
	public ArrayList<SpellBuilder> createSpells() {
		ArrayList<SpellBuilder> spellbook = new ArrayList<SpellBuilder>();
		
		spellbook.add(new SpellBuilder("Pepsi Shaker", 2, 8, 80, "NO"));
		spellbook.add(new SpellBuilder("Beard Stroker", 3, 10, 90, "NO"));
		spellbook.add(new SpellBuilder("Pen Thrower", 5, 15, 80, "YES"));
		
		return spellbook;
	}
	
	public SpellBuilder castSpell(int choice) {
		return null;

}
}
