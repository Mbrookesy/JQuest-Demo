package src.spells;

public class SpellBuilder {
	
	private int id;
	private String name;
	private int manaCost;
	private int damage;
	private int accuracy;
	
	public SpellBuilder(int id, String name, int manaCost, int damage, int accuracy) {
		this.setId(id);
		this.setName(name);
		this.setManaCost(manaCost);
		this.setDamage(damage);
		this.setAccuracy(accuracy);
	}
	
	@Override
	public String toString() {
		return this.getName() + " Cost: " + this.getManaCost() + "JP Damage: " + this.getDamage() + " Accuracy: " + this.getAccuracy() + "%";
	}
	
	public String selectionSpell() {
		return "You have selected: " + this.getName();
	}
	
	public SpellBuilder getSpell() {
		return this;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}