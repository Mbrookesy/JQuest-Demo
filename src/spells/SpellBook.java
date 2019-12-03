package src.spells;

import java.util.ArrayList;

public class SpellBook {
	
	public ArrayList<SpellBuilder> startingSpells() {
		ArrayList<SpellBuilder> spellbook = new ArrayList<SpellBuilder>();
		spellbook.add(pepsiShaker);
		spellbook.add(beardStroker);

		return spellbook;
	}
	
	public SpellBuilder castSpell(int choice) {
		return null;

}
	SpellBuilder pepsiShaker = new SpellBuilder("Pepsi Shaker", 2, 8, 80, "NO");
	SpellBuilder beardStroker = new SpellBuilder("Beard Stroker", 3, 10, 90, "NO");
	SpellBuilder penThrower = new SpellBuilder("Pen Thrower", 5, 15, 80, "YES");
	
}
