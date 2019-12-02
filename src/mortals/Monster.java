package src.mortals;

public class Monster extends Mortals{
	
	private int expGiven;
	private String attDesc;
	private String missDesc;

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

	public String getAttDesc() {
		return attDesc;
	}

	public void setAttDesc(String attDesc) {
		this.attDesc = attDesc;
	}

	public String getMissDesc() {
		return missDesc;
	}

	public void setMissDesc(String missDesc) {
		this.missDesc = missDesc;
	}
	
}
