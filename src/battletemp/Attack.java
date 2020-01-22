package src.battletemp;

import java.util.Random;

import src.mortals.MainCharacter;
import src.mortals.Monster;

public class Attack {
	
	public void mainAttack(Random randomGen, MainCharacter mc, Monster mon, int accuracy) {
		accuracy = randomGen.nextInt(100);
		int range = randomGen.nextInt(3);
		if (accuracy < 5) {
			System.out.println("attack missed");
		} else if (accuracy == 99){
			System.out.println("CRITICAL HIT YOU DO " + (mc.attackRange(range) * 2) + " DAMAGE");
			mon.setHp(mon.getHp() - (mc.attackRange(range) * 2));
		} else {
			System.out.println(mc.getName() + " swung his bottle of pepsi and did " + (mc.attackRange(range) - mon.getDef()) + " damage to the devil! ");
			mon.setHp(mon.getHp() - (mc.attackRange(range) - mon.getDef()));
		}
	}

}
