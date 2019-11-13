package src.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Start st = new Start();
		Game games = new Game();
		SpellBook sb = new SpellBook();
		ArrayList<SpellBuilder> spellbook = sb.createSpells();
		Character mainChar = st.begin(sc);
		games.standby(sc, mainChar, spellbook);
		
		

	}

}
