package src.items;

import java.util.ArrayList;

import src.items.consumables.FizzyDrinks;

public class Inventory {
	
	public ArrayList<Items> createBag() {
		ArrayList<Items> inventory = new ArrayList<Items>();
		
		inventory.add(shotOfPepsi);
		
		return inventory;
	}
	
	FizzyDrinks shotOfPepsi = new FizzyDrinks(1, "Shot of Pepsi", 0,"A spicy little shot, Restores 2 Hp", "", 2);
	FizzyDrinks miniPepsi = new FizzyDrinks(2, "miniPepsi", 0, "A spicy little shot, Restores 2 Hp", "", 2);
	
}
