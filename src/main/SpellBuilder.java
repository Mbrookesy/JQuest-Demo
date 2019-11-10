package src.main;

public class SpellBuilder {
	
	private String name;
	private int manaCost;
	private int damage;
	private int accuracy;
	private String locked;
	
	public SpellBuilder(String name, int manaCost, int damage, int accuracy, String locked) {
		this.setName(name);
		this.setManaCost(manaCost);
		this.setDamage(damage);
		this.setAccuracy(accuracy);
		this.setLocked(locked);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getManaCost() {
		return manaCost;
	}

	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}
}