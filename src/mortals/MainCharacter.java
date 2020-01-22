package src.mortals;

public class MainCharacter extends Mortals {
	
	private int mana;
	private int currentXP;
	private int maxXP;
	private int cola;
	private int moral;

	
	public MainCharacter(String name) {
		super(name);
		setHp(20);
		setMana(10);
		setAtt(5);
		setDef(5);
		setSpd(5);
		setLvl(1);
		setCola(3);
		setMoral(50);
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

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getCola() {
		return cola;
	}

	public void setCola(int cola) {
		this.cola = cola;
	}

	public int getMoral() {
		return moral;
	}

	public void setMoral(int moral) {
		this.moral = moral;
	}



}
