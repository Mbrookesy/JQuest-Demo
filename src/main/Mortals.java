package src.main;

public abstract class Mortals {
	private String name;
	private int hp;
	private int att;
	private int def;
	private int spd;
	private int lvl;
	
	public Mortals(String name) {
		super();
		this.name = name;
	}
	
	public Mortals(String name, int hp, int att, int def, int spd, int lvl) {
		super();
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.spd = spd;
		this.lvl = lvl;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtt() {
		return att;
	}
	public void setAtt(int att) {
		this.att = att;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	
	

}
