package src.main;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		Game games = new Game();
		SpellBook spellbook = new SpellBook();
		spellbook.createSpells();
		Character mainChar = st.begin(sc);
		games.standby(sc, mainChar);
		
		

	}

}
