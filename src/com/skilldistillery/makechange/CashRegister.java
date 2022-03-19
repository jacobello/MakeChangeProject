package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tender = 0.0;
		double price = 0.0;
		System.out.println("Greetings! Please enter the price!");
		price = sc.nextDouble();
		System.out.println("Please enter amount tendered by customer!");
		tender = sc.nextDouble();

		double change = tender - price;
		if (change == 0.0) {
			System.out.println("No change.");
		}
		if (change < 0.0) {
			System.out.println("Invalid amount tendered. Check again and/or ask for more money!");
		}
		if (change > 0.01) {
			System.out.println("Please give following change to customer:");
		}
		if (change >= 10) {
			double ten = change/10;
			System.out.println((int)(ten) + " ten dollar bill(s)");
			change = change - (int)ten * 10;
		
		}
		if (change >= 5) {
			double five = change/5;
			System.out.println((int) (five) + " five dollar bill(s)");
			change = change - (int) five * 5;
		}
		if (change >= 1) {
			int one = (int) (change);
			System.out.println(one + " one dollar bill(s)");
			change = change - (int) one * 1;
		}
		if (change >= 0.25) {
			double quarter = change / 0.25;
			System.out.println((int) (quarter) + " quarter(s)");
			change = change - (int) quarter * 0.25;
		}
		if (change >= 0.10) {
			double dime = change / 0.10;
			System.out.println((int) (dime) + " dime(s)");
			change = change - (int) dime * 0.1;
		}
		if (change >= 0.05) {
			double nickel = change / 0.05;
			System.out.println((int) (nickel) + " nickel(s)");
			change = change - (int) nickel * 0.05;
		}
		if (change >= 0.009) {
			double penny = change / 0.009;
			System.out.println((int) (penny) + " penny(ies)");
		}
	}
}
