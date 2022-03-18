package com.skilldistillery.makechange;

public class CashRegister {

	public static void main(String[] args) {
		double tender = 17.95;
		
		double ten = tender % 2;
		System.out.println((int)(ten));	
		tender =  tender - (int)ten*10;
		System.out.println(tender);
		double five = tender % 1;
		System.out.println(five);
		tender =  tender - (int)five*5;
		
		System.out.println(tender);
	//User Story #1
	//	The user is prompted asking for the price of the item.

	//	User Story #2
	//	The user is then prompted asking how much money was tendered by the customer.

	//	User Story #3
	//	Display an appropriate message if the customer provided too little money or the exact amount.

	//	User Story #4
	//	If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.	
		
		
		
		
	}
}
