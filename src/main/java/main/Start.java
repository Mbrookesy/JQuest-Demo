package main;

import java.util.Scanner;

public class Start {

	public Character begin(Scanner sc) {
<<<<<<< HEAD
		System.out.println("Hello and welcome to zap's rpg");
		System.out.println("What is your name?");
		String name = sc.nextLine();
		Character mainChar = new Character(name);
		System.out.println("Hello " + name + " let us begin.");
=======
		System.out.println("Jordan...");
		sc.nextLine();
		System.out.println("What is your name?");
		String name = sc.nextLine();
		Character mainChar = new Character(name);
		System.out.println("Hello " + name + " let us begin.");
		
>>>>>>> branch 'master' of https://github.com/Mbrookesy/JQuest
		return mainChar;
	}

}
