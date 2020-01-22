package src.battletemp;

import java.util.ArrayList;
import java.util.Scanner;

import src.mortals.MainCharacter;
import src.mortals.Monster;
import src.mortals.Mortals;
import src.spells.SpellBuilder;

public class Spell {
	public void castingSpell(ArrayList<SpellBuilder> spellbook, Scanner sc, MainCharacter mc, Monster mon) {
		System.out.println("Current spells:");
		System.out.println(spellbook.toString().replace(", ", "").replace("[", "").replace("]", "").trim());
		System.out.println("");
		System.out.println("What spell would you like to use? (Choose by number)");
		int spellChoice = sc.nextInt() - 1;
		SpellBuilder spell = spellbook.get(spellChoice);
		if (mc.getMana() > spell.getManaCost()) {
			System.out.println(mc.getName() + " casted " + spell.getName() + "!");
			System.out.println(mc.getName() + " did " + spell.getDamage() + " Damage!");
			mon.setHp(mon.getHp() - spell.getDamage());
		} else {
			System.out.println("You do not have enough mana.");
		}
	}
}
