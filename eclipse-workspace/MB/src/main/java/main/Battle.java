package main;

import java.util.Random;
import java.util.Scanner;

public class Battle {
	
	public void battle(Scanner sc, Character mc) {
		Random randomGen = new Random();
		
		String condition = "";
		
		Monster mon = new Monster("Duck", 10, 5, 5, 3, 1);
		
		System.out.println("Suddenly a lvl " + mon.getLvl() + " " + mon.getName() + " appeared");
		
		do {
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
			if (accuracy < 5) {
				System.out.println("attack missed");
			} else {
				System.out.println(mc.getName() + " did " + mc.getAtt() + " damage to the devil! ");
				mon.setHp(mon.getHp() - mc.getAtt());
				System.out.println("The devil now has only " + mon.getHp() + "hp");
			}
			
		} else if (action == 2) {
			
		} else if (action == 3) {
			
		} else if (action == 4) {
			
		} else if (action == 5) {
			System.out.println(mc.getName() + " climbed on his bottle of pepsi max and used it as a rocket to flee");
			System.out.println("");
			condition = "flee";
		}
		
		}while(mon.getHp() > 0 || mc.getHp() > 0 || condition != "flee");
		
		
	}

}
