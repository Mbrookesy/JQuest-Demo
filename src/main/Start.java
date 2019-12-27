package src.main;

import java.util.Scanner;

import src.mortals.MainCharacter;

public class Start {

	public MainCharacter begin(Scanner sc) {

		System.out.println("Human....");
		sc.nextLine();
		System.out.println("What is your name?");
		String name = sc.nextLine();
		if (name.equalsIgnoreCase("Jordan")) {
			System.out.println("Ah Jordan good...");
		}	else  {
			System.out.println("I sense something wrong... did you mean Jordan?...(Y/N)");
			sc.nextLine();
			System.out.print("Ah Jordan good...");
		}
		MainCharacter mainChar = new MainCharacter("Jordan");
		System.out.println("Hello Jordan let us begin...");
		sc.nextLine();
		System.out.println("There is much to learn... but for now we must get you out of the forest...");
		sc.nextLine();
		return mainChar;
	}

}
