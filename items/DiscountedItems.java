package items;

class DiscountedItems extends Items {

	private double discount = 0.25;

	DiscountedItems(String name, int price, int amount) {
		super(name, price, amount);

	}

	double getDiscount() {
		return getPrice() - (getPrice() * discount);
	}

}
