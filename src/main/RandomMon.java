package src.main;

import java.util.Random;

public class RandomMon {

	public Monster ranMon(String zone) {
		Random randomGen = new Random();

		switch (zone) {
		case "forest":
			Monster monsterforest = forest(randomGen);
			return monsterforest;
		}
		return null;
	}

	public Monster forest(Random rangen) {
		int randomPick = rangen.nextInt(3);

		switch (randomPick) {
		case 0:
			Monster duck = new Monster("Duck", 10, 2, 2, 3, 1);
			return duck;
		case 1:
			Monster chicken = new Monster("Chicken", 8, 3, 1, 3, 1);
			return chicken;
		case 2:
			Monster pepsiJr = new Monster("Pepsi Jr ", 12, 3, 1, 5, 2);
			return pepsiJr;
		}
		return null;
	}

}
