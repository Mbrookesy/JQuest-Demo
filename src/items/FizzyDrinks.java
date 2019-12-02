package src.items;

public class FizzyDrinks extends Items{
	private String type;
	private int heal;
	
	public FizzyDrinks(int id, String name, String quantity, String desc, int heal){
		super(id, name, quantity, desc);
		setType("FizzyDrink");
		setHeal(heal);
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
