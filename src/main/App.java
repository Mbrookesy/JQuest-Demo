package src.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.items.Inventory;
import src.items.Items;
import src.mortals.MainCharacter;
import src.spells.SpellBook;
import src.spells.SpellBuilder;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Start st = new Start();
		Game games = new Game();
		SpellBook sb = new SpellBook();
		Inventory inv = new Inventory();
		Credits credit = new Credits();
		String choice;
		do {
		choice = menu.menuScreen(sc);
		if (choice == "1") {
			ArrayList<Items> inventory = inv.createBag();
			ArrayList<SpellBuilder> spellbook = sb.startingSpells();
			MainCharacter mainChar = st.begin(sc);
			games.standby(sc, mainChar, spellbook, inventory);
		} else if (choice == "2") {
			System.out.println("Feature to be added in the future");
		} else if (choice == "3") {
			System.out.println("Feature to be added in the future");
		} else if (choice == "4") {
			credit.credits(sc);
		} else {
			System.exit(0);
		}
	}while(choice != null);

	}
}

