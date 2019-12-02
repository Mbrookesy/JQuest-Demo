package src.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.mortals.Character;
import src.mortals.Monster;
import src.mortals.RandomMon;
import src.spells.SpellBuilder;

public class Battle {

	public String battle(Scanner sc, Character mc, String zone, ArrayList<SpellBuilder> spellbook) {
		Random randomGen = new Random();
		RandomMon ranmon = new RandomMon();
		
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
				accuracy = randomGen.nextInt(100);
				int range = randomGen.nextInt(3);
				if (accuracy < 5) {
					System.out.println("attack missed");
				} else if (accuracy == 99){
					System.out.println("CRITICAL HIT YOU DO " + (mc.attackRange(range) * 2) + " DAMAGE");
					mon.setHp(mon.getHp() - (mc.attackRange(range) * 2));
				} else {
					System.out.println(mc.getName() + " swung his bottle of pepsi and did " + (mc.attackRange(range) - mon.getDef()) + " damage to the devil! ");
					mon.setHp(mon.getHp() - (mc.attackRange(range) - mon.getDef()));
				}
				 
			} else if (action == 2) {

			} else if (action == 3) {
				System.out.println(mc.getName() + " braces for impact");
				guard = true;
			} else if (action == 4) {

			} else if (action == 5) {
				System.out.println(mc.getName() + " climbed on his emergency bottle of pepsi max and used it as a rocket to flee");
				System.out.println("");
				condition = "flee";
			}
			
			System.out.println("The devil now has " + mon.getHp() + "hp");
			
			if (mon.getHp() > 0) {
				int range2 = randomGen.nextInt(3);
				accuracy = randomGen.nextInt(100);
				if (accuracy < 5) {
					System.out.println("The " + mon.getName() + mon.getMissDesc() + " missing their chance of attack!");
				} else {
					if (guard == true) {
						System.out.println("The " + mon.getName() + mon.getAttDesc() + " and did " + (mon.attackRange(range2) - mc.getDef()) + " damage!");
						mc.setHp(mc.getHp() - (mon.attackRange(range2) - mc.getDef()));
					}	else	{
						System.out.println("The " + mon.getName() + mon.getAttDesc() + " and did " + (mon.attackRange(range2) - (mc.getDef() / 2)) + " damage!");
						mc.setHp(mc.getHp() - (mon.attackRange(range2) - (mc.getDef() / 2)));
					}
				}
				System.out.println("You now have only " + mc.getHp() + "hp");
			}
			
			
			if (mc.getHp() <= 0) {
				System.out.println("You start feel dizzy and suddenly... collapse");
				return "Death";
			}
			
			if (condition == "flee") {
				return "Flee";
			}

		} while (mon.getHp() > 0 && mc.getHp() > 0);
		
		return "Win";

	}

}
