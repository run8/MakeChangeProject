package com.skilldistillery;

import java.util.Scanner;

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
		centDue =  centPaid - centPrice;

		if (centPaid == centPrice) {
			System.out.println("Customer provided exact change.");
			scanner.close();
			return;
		}
		
		if (centPaid < centPrice) {
			System.out.println("Customer did not provide enough money.");
			scanner.close();
			return;
		}
		
		System.out.print("Amount: " + priceMessage(centPrice) + ", Tendered: " + priceMessage(centPaid) + ", ");
		System.out.print("Result: " + numTensMessage(centDue));

		if (centDue >= 1000) {
			centDue -= 1000;
		}
		System.out.print(numFivesMessage(centDue));

		if (centDue >= 500) {
			centDue -= 500;
		}
		
		System.out.print(numOnesMessage(centDue));
		for (int i=0; i<4; i++) {
			if (centDue >= 100) {
				centDue -= 100;
			}
		}
		
		System.out.print(numQuartersMessage(centDue));
		for (int i=0; i<3; i++) {
			if (centDue >= 25) {
				centDue -= 25;
			}
//			System.out.println("centDue in quarters: " + centDue);
		}
		
		System.out.print(numDimesMessage(centDue));

		for (int i=0; i<2; i++) {
			if (centDue >= 10) {
				centDue -= 10;
			}
		}
		
		System.out.print(numNickelsMessage(centDue));

		if (centDue >= 5) {
			centDue -= 5;
		}
		
		System.out.print(numPenniesMessage(centDue));

		for (int i=0; i<5; i++) {
			if (centDue >= 5) {
				centDue -= 1;
			}
		}
		scanner.close();
		System.out.print(".");
	}
		public static String priceMessage(int numCents) {
			if (numCents < 10) {
				return(".0" + String.valueOf(numCents));
			} else if (numCents < 100) {
				return("." + String.valueOf(numCents));
			}
			 else if (numCents < 1000) {
				return(""+String.valueOf(numCents).substring(0, 1)) + "." + String.valueOf(numCents).substring(1, 3);
			} else if (numCents < 10000) {
				return(""+String.valueOf(numCents).substring(0, 2)) + "." + String.valueOf(numCents).substring(2, 4);
			}
			return "";
		}
		
		public static String numTensMessage(int cents) {
			String numTensMessage = "";
			if (cents - 1000 > 1) {
				numTensMessage = "1 ten dollar bill,";
			}
			else if (cents - 1000 == 1000) {
				numTensMessage = "1 ten dollar bill";
			}
						
			return numTensMessage; 
		}
		
		public static String numFivesMessage(int cents) {
			String numFivesMessage = "";
			if (cents - 500 >= 1) {
				numFivesMessage = " 1 five dollar bill";
			}
			else if (cents - 500 == 500) {
				numFivesMessage = " 1 five dollar bill";
			}
						
			return numFivesMessage; 
		}
		
		public static String numOnesMessage(int cents) {
			String numOnesMessage = "";
			if (cents >= 100) {
				if (cents == 100) {
					System.out.print("1 one dollar bill");
				} else {
				numOnesMessage = String.valueOf(" " + cents / 100) + " one dollar bills";
				} 
			}
		return numOnesMessage;
		} 
			
		public static String numQuartersMessage(int cents) {
				String numQuartersMessage = "";
				if (cents >= 25) {
					if (cents == 25) {
					numQuartersMessage = "1 quarter";
					} else {
					numQuartersMessage = String.valueOf(cents / 25) + " quarters";
					}
				}

			return numQuartersMessage;
			} 		

		public static String numDimesMessage(int cents) {
				String numDimesMessage = "";
//				System.out.println("cents in dimes: " + cents);
				if (cents >= 10) {
					if (cents <= 11) {
						numDimesMessage = "1 dime";
					} else {
					numDimesMessage = String.valueOf(cents / 10) + " dimes";
					}
				}
				placeCommaOrNot(cents);

			return numDimesMessage;
		}
			

		public static String numNickelsMessage(int cents) {
				String numNickelsMessage = "";
				if (cents >= 5) {
					if (cents <= 6) {
						numNickelsMessage = "1 nickel";
					} else {
					numNickelsMessage = String.valueOf(cents / 5) + " nickels";
					}
				}
				placeCommaOrNot(cents);

			return numNickelsMessage;
			} 
		
		public static String numPenniesMessage(int cents) {
				String numPenniesMessage = "";
				if (cents >= 1) {
					if (cents < 2) {
						numPenniesMessage =  "1 penny";
					} else {
					numPenniesMessage = String.valueOf(cents / 5) + " pennies";
					}
				}
			placeCommaOrNot(cents);
			return numPenniesMessage;
			} 
		
		public static void placeCommaOrNot(int cents) {
			String commaOrNot = "";
			
			if (cents > 0) {
				commaOrNot = ", ";
			}
			System.out.print(commaOrNot);
		}
}
