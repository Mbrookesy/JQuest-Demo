package src.main;

public class Character extends Mortals {
	
	private int currentXP;
	private int maxXP;
	
	public Character(String name) {
		super(name);
		setHp(20);
		setAtt(5);
		setDef(10);
		setSpd(5);
		setLvl(1);
		setCurrentXP(0);
		setMaxXP(getLvl() * 20 + 30);
	}

	public int getCurrentXP() {
		return currentXP;
	}

	public void setCurrentXP(int currentXP) {
		this.currentXP = currentXP;
	}

	public int getMaxXP() {
		return maxXP;
	}

	public void setMaxXP(int maxXP) {
		this.maxXP = maxXP;
	}



}
