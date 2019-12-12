package src.main;

import java.util.Scanner;

import src.mortals.MainCharacter;

public class Start {

	public MainCharacter begin(Scanner sc) {

		System.out.println("Jordan...");
		sc.nextLine();
		System.out.println("What is your name?");
		String name = sc.nextLine();
		MainCharacter mainChar = new MainCharacter(name);
		System.out.println("Hello " + name + " let us begin.");
		
		return mainChar;
	}

}
