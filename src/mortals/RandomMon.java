package src.mortals;

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
			Monster duck = new Monster("Duck", 10, 5, 2, 3, 1);
			duck.setAttDesc(" squarked loudly");
			duck.setMissDesc(" squarked at a random sign");
			return duck;
		case 1:
			Monster chicken = new Monster("Chicken", 8, 6, 1, 3, 1);
			chicken.setAttDesc(" pecked you");
			chicken.setMissDesc(" pecked a nearby tree");
			return chicken;
		case 2:
			Monster pepsiJr = new Monster("Pepsi Jr ", 12, 6, 1, 5, 2);
			pepsiJr.setAttDesc(" spewed off-brand Pepsi at you");
			pepsiJr.setMissDesc(" simply drank a bit of themself");
			return pepsiJr;
		}
		return null;
	}

}
