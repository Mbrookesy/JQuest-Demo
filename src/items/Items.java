package src.items;

public class Items {
	private int id;
	private String name;
	private String quantity;
	private String desc;
	
	public Items(int id, String name, String quantity, String desc) {
		this.setName(name);
		this.setId(id);
		this.setQuantity(quantity);
		this.setDesc(desc);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

