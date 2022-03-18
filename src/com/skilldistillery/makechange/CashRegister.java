package com.skilldistillery.makechange;

public class CashRegister {
	
	public static void main(String[] args) {
		double tender = 17.95;
		double ten = tender % 2;
		System.out.println((int)(ten));	
		tender =  tender - (int)ten*10;
		System.out.println(tender);
	}
}
