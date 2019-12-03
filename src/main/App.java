package src.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import src.items.Inventory;
import src.items.Items;
import src.mortals.Character;
import src.spells.SpellBook;
import src.spells.SpellBuilder;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		Game games = new Game();
		SpellBook sb = new SpellBook();
		Inventory inv = new Inventory();
		
		ArrayList<Items> inventory = inv.createBag();
		ArrayList<SpellBuilder> spellbook = sb.startingSpells();
		Character mainChar = st.begin(sc);
		games.standby(sc, mainChar, spellbook, inventory);
		
		

	}

}
