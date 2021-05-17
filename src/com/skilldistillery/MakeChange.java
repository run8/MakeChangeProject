package com.skilldistillery;

import java.util.Scanner;

//public class MakeChange {
//
//	public static void main(String[] args) {
//		makeChange();
//	}
//
//	public static void makeChange() {
//
//		int centsDue = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("What is the price of the item? ");
//		double price = scanner.nextDouble();
//		System.out.print("How much money was tendered by the customer? ");
//		double amountTendered =  scanner.nextDouble();
//		int centCost = (int) (price * 100);
//		int centTendered = (int) (amountTendered * 100);
//		
////		String priceFormatted = "";
////		int priceNumFormatted = 0;
////		String amountTenderedFormatted = "";
////		int amountTenderedNumFormatted = 0;
////		if (price < 1) {
////			priceNumFormatted = (int) (price * 100);
////			priceFormatted = "." + String.valueOf(priceNumFormatted);
////		} else if (price >= 1) {
////			priceFormatted = String.valueOf(price) ;
////		}
////		
////		if (amountTendered >= 1) 
////		{
////			amountTenderedFormatted = String.valueOf(amountTendered) + "0";
////		} else if (amountTendered < 1) {
////			amountTenderedNumFormatted = (int) (amountTendered * 100);
////			amountTenderedFormatted = "." + String.valueOf(amountTenderedNumFormatted);
////		}
////		
////		System.out.print("Amount: " + priceFormatted + ", Tendered: " + amountTenderedFormatted + ", Result: ");
////		if (price > amountTendered) {
////			System.out.print("Customer provided too little money.");
////		} else if (price == amountTendered) {
////			System.out.print("Customer provided the exact amount of money.");
////		} else {
////			centsDue =  amountTendered - price;
////			System.out.println();
////			System.out.println("change due before: " + changeDue);
////			System.out.println();
//
//			if (centsDue >= 1000 ) {
//				System.out.print("1 ten dollar bill");
//				centsDue -= 1000;
//				if (centsDue > 0) {
//					System.out.print(", ");
//				}
////				System.out.println();
////				System.out.println("change due in tens: " + centsDue/1000);
////				System.out.println();
//			}
//			if (centsDue >= 500) {
//				System.out.print("1 five dollar bill");
//				centsDue -= 500;
//				if (centsDue > 0) {
//					System.out.print(", ");
//				}
////				System.out.println();
////				System.out.println("change due in fives: " + changeDue);
////				System.out.println();
//			}
//			if (centsDue >= 100) {
//				int numOnes = centsDue / 100;
//				if (numOnes == 100) {
//					System.out.print(numOnes + " one dollar bill");
//				} else {
//					System.out.print(numOnes + " one dollar bills");
//				}
//				centsDue -= numOnes;
//				if (changeDue > 0) {
//					System.out.print(", ");
//				}
//				System.out.println();
//				System.out.println("change due ones: " + changeDue);
//				System.out.println();
//			}
//			if (changeDue >= .25 ) {
//				int numQuarters = (int) (changeDue / .25);
//				if (numQuarters >= 2) {
//				System.out.print(numQuarters + " quarters");
//				} else {
//					System.out.print(numQuarters + " quarter");					
//				}
//				changeDue = changeDue - numQuarters * .25;
//				if (changeDue > 0) {
//					System.out.print(", ");
//				}
//				System.out.println();
//				System.out.println("change due in quarters: " + changeDue);
//				System.out.println();
//			}
//			if (changeDue >= .10) {
//				int numDimes = (int) (changeDue / .1);
//				if (numDimes > 1) {
//				System.out.print(numDimes + " dimes");
//				} else {
//					System.out.print(numDimes + " dime");
//				}
//				changeDue = changeDue - numDimes * .1;
//				if (changeDue > 0) {
//					System.out.print(", ");
//				}
//				System.out.println();
//				System.out.println("change due in dimes: " + changeDue);
//				System.out.println();
//			}
//			if (changeDue >= .05) {
//				int numNickles = (int) (changeDue / .05);
//				if (numNickles > 1) {
//				System.out.print(numNickles + " nickles");
//				} else {
//					System.out.print(numNickles + " nickel");					
//				}
//				changeDue = changeDue - numNickles * .05;
//				if (changeDue > 0) {
//					System.out.print(", ");
//				}
//				System.out.println();
//				System.out.println("change due nickles: " + changeDue);
//				System.out.println();
//			}
//			if (changeDue >= .01) {
//				int numPennies = (int) (changeDue / .01);
//				if (numPennies > 1) {
//				System.out.print(++numPennies + " pennies");
//				} else {
//					System.out.print(numPennies + " penny");					
//				}
//			}
//			System.out.println();
//			System.out.println("Change due in pennies: " + changeDue);
//			System.out.print(".");
//			scanner.close();
//		}
//	}
//}

public class MakeChange {
	public static void main(String[] args) {
		makeChange();
	}
	
	public static void makeChange() {
		double price = 0.0;
		double paid = 0.0;
		int centPrice = 0;
		int centPaid = 0;
		int centDue = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is the price of the item? ");
		price = scanner.nextDouble();
		System.out.println("How much money was tendered?");
		paid = scanner.nextDouble();
		
		centPaid = (int) (paid * 100);
		centPrice = (int) (price * 100);
		System.out.println("centPrice: " + centPrice);
		
//		if (centPaid == centPrice) {
//			System.out.println("Customer provided exact change.");
//			return;
//		}
//		
//		if (centPaid < centPrice) {
//			System.out.println("Customer did not provide enough money.");
//			return;
//		}
		
		String paidString = "";
		int costNum = 0;
		int priceNum = 0;
		
		System.out.print("Amount: " + dollarPriceMessage(centPrice) + centPriceMessage(centPrice));
		System.out.print(", Result: ");
	}
		public static String centPriceMessage(int change) {
			String centString = "";
			int cents = change % 100;
			
		if (cents == 10) {
			centString = ".10";
		} else if (cents == 20) {
			centString = ".20";			
		} else if (cents == 30) {
			centString = ".30";			
		} else if (cents == 40) {
			centString = ".40";			
		} else if (cents == 50) {
			centString = ".50";			
		} else if (cents == 60) {
			centString = ".60";			
		} else if (cents == 70) {
			centString = ".70";			
		} else if (cents == 80) {
			centString = ".80";			
		} else if (cents == 90) {
			centString = ".90";			
		} else if (cents < 10) {
			centString = ".0" + String.valueOf(cents % 10);
		} else if (cents > 10 && cents < 100) {
			centString = "." + String.valueOf(cents);
		} else {
			centString = ".00";
		}
		return centString;
		}
		
		public static String dollarPriceMessage(int cents) {
			String dollarMessage = "";
			if (cents >= 100) {
				dollarMessage = String.valueOf(cents / 100);
			} 
			
			return dollarMessage;
		}
			
		
		

//		if (centPaid - centPrice >= 1000) {
//			String tenMessage = centPaid - centPrice == 1000 ? "1 ten dollar bill." : "1 ten dollar bill,";
//			System.out.println(tenMessage);
//		} else if (centPaid - centPrice >= 500) {
//			String tenMessage = centPaid - centPrice == 500 ? "1 five dollar bill." : "1 five dollar bill,";
//			System.out.println(tenMessage);
//		}
		

}
