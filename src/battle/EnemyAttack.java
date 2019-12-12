package src.battle;

import java.util.Random;

import src.mortals.MainCharacter;
import src.mortals.Monster;

public class EnemyAttack {
	
	public void enemyAttacking(Random randomGen, int accuracy, Monster mon, MainCharacter mc, Boolean guard) {
		int range2 = randomGen.nextInt(3);
		accuracy = randomGen.nextInt(100);
		if (accuracy < 5) {
			System.out.println("The " + mon.getName() + mon.getMissDesc() + " missing their chance of attack!");
		} else {
			if (guard == true) {
				System.out.println("The " + mon.getName() + mon.getAttDesc() + " and did " + (mon.attackRange(range2) - mc.getDef()) + " damage!");
				mc.setHp(mc.getHp() - (mon.attackRange(range2) - mc.getDef()));
			}	else	{
				System.out.println("The " + mon.getName() + mon.getAttDesc() + " and did " + (mon.attackRange(range2) - (mc.getDef() / 2)) + " damage!");
				mc.setHp(mc.getHp() - (mon.attackRange(range2) - (mc.getDef() / 2)));
			}
		}
		System.out.println("You now have only " + mc.getHp() + "hp");
	}

}
