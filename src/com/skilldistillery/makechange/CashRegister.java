package com.skilldistillery.makechange;


public class CashRegister {

	public static void main(String[] args) {
		double tender = 1.5;
		double price = .05;
		double change = tender - price;
		System.out.println(change);

		if (change >= 10) {
			int ten = 1;

			System.out.println((ten) + " ten dollar bill");
			change = change - ten * 10;

			System.out.println(change + " after $10");
		}
		if (change >= 5) {
			double five = 1;
			System.out.println((int) (five) + " 5 dollar bill");
			change = change - (int) five * 5;
			System.out.println(change + " after 5 dollar");
		}

		if (change >= 1) {
			int one = (int) (change);
			System.out.println(one + " 1 dollar bill");
			change = change - (int) one * 1;
			System.out.println(change + " after 1 dollar");
		}
		if (change >= 0.25) {
			double quarter = change / 0.25;
			System.out.println((int) (quarter) + " quarter coin");
			change = change - (int) quarter * 0.25;
			System.out.println(change + " after quarter");
		}
		if (change >= 0.10) {
			double dime = change / 0.10;
			System.out.println((int) (dime) + " dime coin");
			change = change - (int) dime * 0.1;
			System.out.println(change + " after dime");
		}
		if (change >= 0.05) {
			double nickel = change / 0.05;
			System.out.println((int) (nickel) + " nickel coin");
			change = change - (int) nickel * 0.05;
			System.out.println(change + " after nickel");
		}
		if (change >= 0.009) {
			double penny = change / 0.009;
			System.out.println((int) (penny) + " penny coin");
		}
		// User Story #1
		// The user is prompted asking for the price of the item.

		// User Story #2
		// The user is then prompted asking how much money was tendered by the customer.

		// User Story #3
		// Display an appropriate message if the customer provided too little money or
		// the exact amount.

		// User Story #4
		// If the amount tendered is more than the cost of the item, display the number
		// of bills and coins that should be given to the customer.

	}
}
