package main;

import java.util.Scanner;

public class Start {

	public Character begin(Scanner sc) {
		System.out.println("Hello and welcome to zap's rpg");
		System.out.println("What is your name?");
		String name = sc.nextLine();
		Character mainChar = new Character(name);
		System.out.println("Hello " + name + " let us begin.");
		return mainChar;
	}

}
