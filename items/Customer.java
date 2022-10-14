package items;

class Customer {

	private int numberOfPurchasedItems;
	private int sumOfPurchasedItems;

	void itemsAndSumIncrease(int purchase) {

		this.sumOfPurchasedItems = this.sumOfPurchasedItems + purchase;
		this.numberOfPurchasedItems = this.numberOfPurchasedItems + 1;

	}

	void printTotal() {
		System.out.println("Your have purchased a totalt of " + numberOfPurchasedItems + " items. The total cost was: "
				+ sumOfPurchasedItems + " SEK");
	}

}
