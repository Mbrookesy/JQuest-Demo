package src.battletemp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.mortals.MainCharacter;
import src.mortals.Monster;
import src.mortals.RandomMon;
import src.spells.SpellBuilder;

public class Battle {

	public String battle(Scanner sc, MainCharacter mc, String zone, ArrayList<SpellBuilder> spellbook) {
		Random randomGen = new Random();
		RandomMon ranmon = new RandomMon();
		Attack att = new Attack();
		Flee flee = new Flee();
		Guard grd = new Guard();
		Spell spll = new Spell();
		EnemyAttack monAtt = new EnemyAttack();
		
		String condition = "";
		
		Monster mon = ranmon.ranMon(zone);

		System.out.println("A lvl " + mon.getLvl() + " " + mon.getName() + " has materialised");

		do {
			boolean guard = false;
			int accuracy = 100;
			System.out.println("What do you do? (Input Number)");
			System.out.println("1) Attack");
			System.out.println("2) Spells");
			System.out.println("3) Guard");
			System.out.println("4) Items");
			System.out.println("5) Flee");
			System.out.println();
			int action = sc.nextInt();

			if (action == 1) {
				att.mainAttack(randomGen, mc, mon, accuracy);
				 
			} else if (action == 2) {
				spll.castingSpell(spellbook, sc, mc, mon);
					    
			} else if (action == 3) {
				guard = grd.prepareGuard(mc);
			} else if (action == 4) {

			} else if (action == 5) {
				condition = flee.fleeing(mc);
				break;
			}
			
			System.out.println("The devil now has " + mon.getHp() + "hp");
			
			if (mon.getHp() > 0) {
				monAtt.enemyAttacking(randomGen, accuracy, mon, mc, guard);
			}
			
			
			if (mc.getHp() <= 0) {
				System.out.println("You start feel dizzy and suddenly... collapse");
				return "Death";
			}

		} while (mon.getHp() > 0 && mc.getHp() > 0 && condition != "Flee");
		if (condition == "Flee") {
			return "Flee";
		}
		return "Win";

	}

}
