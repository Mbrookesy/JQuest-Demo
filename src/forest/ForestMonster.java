package src.forest;

import java.util.Random;

import src.mortals.Monster;

public class ForestMonster {
	
	Monster monster;
	
	public Monster demoMonster() {
		
		Random rand = new Random();
		int monsterNumber = rand.nextInt(5);
		switch(monsterNumber) {
		case 0: monster = new Monster("Cola Chicken", 10, 1, 3, 3, 1); break;
		case 1: monster = new Monster("Cola Employee", 12, 2, 2, 4, 2); break;
		case 2: monster = new Monster("Fizz Beaver", 8, 1, 4, 2, 1); break;
		case 3: monster = new Monster("Fizzy Bee", 5, 1, 2, 4, 0); break;
		case 4: monster = new Monster("Ian", 20, 3, 4, 4, 2); break;
		}
		return monster;
	}

}
