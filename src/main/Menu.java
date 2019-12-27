package src.main;

import java.util.Scanner;

public class Menu {
	
	public String menuScreen(Scanner sc) {
		 System.out.println("Welcome to JQuest!");
		 System.out.println("");
		 System.out.println("Please select an option.");
		 System.out.println();
		 System.out.println("1. New Game");
		 System.out.println("2. Load Game");
		 System.out.println("3. Help");
		 System.out.println("4. Credits");
		 System.out.println("9. Exit");
		 String choice = sc.nextLine();
		 
		 switch(choice) {
		 case "1":
			 return "1";
		 case "2":
			 return "2";
		 case "3":
			 return "3";
		 case "4": 
			 return "4";
		 case "9":
			 return "9";
		 default:
			 System.out.println("Please input a valid number");
			 menuScreen(sc);
			 return "Fail";
		 }
		
		
	}

}
