//Maurice Kaleebi MP2 JAVA

package items;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		Customer c = new Customer();

		Items i = new Items("Banana", 10, 20);
		Items i2 = new Items("Apple", 5, 15);
		DiscountedItems disc = new DiscountedItems("Vodka", 180, 10);
		disc.getDiscount();

		int checkOut;

		do {
			System.out.println("1. " + i.getName() + ", " + i.getPrice() + " SEK, " + i.getAmount() + " Left" + "\n2. "
					+ i2.getName() + "," + " " + i2.getPrice() + " SEK, " + i2.getAmount() + " Left" + "\n3. "
					+ disc.getName() + ", " + disc.getDiscount() + " SEK -- Now on Sale!, " + disc.getAmount() + " Left"
					+ " \n4. Quit ");
			checkOut = myScanner.nextInt();

			switch (checkOut) {

			case 1:
				i.updateAmount();
				c.itemsAndSumIncrease(i.getPrice());
				System.out.println(
						"You bought a " + i.getName() + " " + i.getPrice() + " SEK, " + i.getAmount() + " left");
				break;

			case 2:
				i2.updateAmount();
				c.itemsAndSumIncrease(i2.getPrice());
				System.out.println(
						"You bought a " + i2.getName() + " " + i2.getPrice() + " SEK, " + i2.getAmount() + " left");
				break;

			case 3:
				disc.updateAmount();
				c.itemsAndSumIncrease((int) disc.getDiscount());
				System.out.println("You bought " + disc.getName() + " " + disc.getDiscount() + " SEK, "
						+ disc.getAmount() + " left");
				break;
			}

		} while (checkOut != 4);

		c.printTotal();
		System.out.println("Thank you, Come again!");

		myScanner.close();
	}

}
