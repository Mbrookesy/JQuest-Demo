package src.items.consumables;

import src.items.Items;

public class FizzyDrinks extends Items{
	private int heal;
	
	public FizzyDrinks(int id, String name, int quantity, String desc, String type, int heal){
		super(id, name, quantity, desc, "Fizzies");
		setHeal(heal);
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}

}
