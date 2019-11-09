package main;

public class Monster extends Mortals{
	
	private int expGiven;

	public Monster(String name, int hp, int att, int def, int spd, int lvl) {
		super(name, hp, att, def, spd, lvl);
		setExpGiven(lvl * 10 + 5);
	}

	public int getExpGiven() {
		return expGiven;
	}

	public void setExpGiven(int expGiven) {
		this.expGiven = expGiven;
	}

}
