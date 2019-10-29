package main;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	
	public void battle(Scanner sc, Character mc) {
		Random randomGen = new Random();
		
		boolean flee = false;
		
		Monster mon = new Monster("Duck", 10, 5, 5, 3, 1);
		
		System.out.println("Suddenly a lvl " + mon.getLvl() + " " + mon.getName() + " appeared");
		
		do {
		int accuracy = 100;
		System.out.println("What do you do? (Attack/Spells/Guard/Items/Flee)");
		System.out.println();
		String action = sc.nextLine();
		
		if (action == "attack") {
			accuracy = randomGen.nextInt(100);
			if (accuracy < 5) {
				System.out.println("attack missed");
			} else {
				System.out.println(mc.getName() + " did " + mc.getAtt() + " damage to the devil! ");
				mon.setHp(mon.getHp() - mc.getAtt());
				System.out.println("The devil now has only " + mon.getHp() + "hp");
			}
			
			
		}
		
		}while(mon.getHp() > 0 || mc.getHp() > 0 || flee == true);
		
		
	}

}
