package src.spells;

public class SpellBook {
	
	public SpellBuilder[] startingSpells() {
		
		SpellBuilder pepsiShaker = new SpellBuilder(1,"Pepsi Shaker", 2, 8, 80);
		SpellBuilder beardStroker = new SpellBuilder(2,"Beard Stroker", 3, 10, 90);
		SpellBuilder penThrower = new SpellBuilder(3,"Pen Thrower", 5, 15, 80);
		
		SpellBuilder[] spellbook = {pepsiShaker, beardStroker, penThrower};
		return spellbook;
	}
	
	public SpellBuilder castSpell(int choice) {
		return null;
	}
		
	
	
}
