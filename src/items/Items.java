package src.items;

public class Items {
	private int id;
	private String name;
	private int quantity;
	private String desc;
	private String type;
	
	public Items(int id, String name, int quantity, String desc, String type) {
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

