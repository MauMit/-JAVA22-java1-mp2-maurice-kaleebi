package items;

class Items {

	private String name;
	private int price;
	private int amount;

	Items(String name, int price, int amount) {

		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getAmount() {
		return amount;
	}

	void updateAmount() {

		this.amount = this.amount - 1;

	}

}
