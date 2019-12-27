package src.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.battle.Battle;
import src.items.Items;
import src.mortals.MainCharacter;
import src.spells.SpellBuilder;

public class Game {
	
	public void standby(Scanner sc, MainCharacter mc, ArrayList<SpellBuilder> spellbook, ArrayList<Items> inventory) {
		Battle btl = new Battle();
		Random randomGen = new Random();
		int pass = 0;
		String zone = "forest";
		
		System.out.println();
		System.out.println("You begin to walk, press enter to continue walking");
		
		do {
			pass = randomGen.nextInt(100);
			System.out.println("Step...");
			if (pass > 50) {
				System.out.println("....!");
				String status = btl.battle(sc, mc, zone, spellbook, inventory);
				if(status == "Death") {
					System.out.println("Game over.. please try start over");
					String[] args = {};
					App.main(args);
				}
				
			}
			System.out.println("...");
			
		}while(pass < 90);
		
		System.out.println("You made it out of the forest");
		
	}

}
