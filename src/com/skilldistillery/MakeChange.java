package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MakeChange makeChange = new MakeChange();
		makeChange.launch(scanner);
		scanner.close();
	}

	public void launch(Scanner scanner) {
		System.out.print("Enter item cost: ");
		int centCost = (int) (100 * scanner.nextDouble());
		System.out.print("Enter amount paid: ");
		int centPaid = (int) (100 * scanner.nextDouble());
		System.out.print("Amount: " + formatMoney(centCost) + " " );
		System.out.print("Tendered: " + formatMoney(centPaid));
		System.out.print(checkCostPrice(centCost, centPaid));
		System.out.print(determineDenominations(centPaid, centCost));
	}

	public String checkCostPrice(int centPrice, int centPaid) {
		String costPriceMessage = " Result: ";
		if (centPaid == centPrice) {
			costPriceMessage += "Customer provided exact change.";
		} else if (centPaid < centPrice) {
			costPriceMessage += "Customer did not provide enough money.";
		}
		return costPriceMessage;
	}

	public String formatMoney(int numCents) {
		String formattedMoney = "";
		if (numCents < 10) {
			formattedMoney = ".0" + String.valueOf(numCents) + ",";
		} else if (numCents < 100) {
			formattedMoney = "." + String.valueOf(numCents) + ",";
		} else if (numCents < 1000) {
			formattedMoney = "" + String.valueOf(numCents).substring(0, 1) + "."
					+ String.valueOf(numCents).substring(1, 3) + ",";
		} else if (numCents < 10000) {
			formattedMoney = "" + String.valueOf(numCents).substring(0, 2) + "."
					+ String.valueOf(numCents).substring(2, 4) + ",";
		}
		return formattedMoney;
	}

	public String determineDenominations(int centPaid, int centPrice) {
		int centsDue = centPaid - centPrice;
		String denominations = "";
		String tensStr = "";
		String fiveStr = "";
		String oneStr = "";
		String qrtStr = "";
		String dimeStr = "";
		String nickelStr = "";
		String pennyStr = "";

		if (centsDue >= 1000) {
			int tens = centsDue / 1000;
			String tenS = tens > 1 ? " ten dollar bills, " : " ten dollar bill, ";
			tensStr = Integer.toString(tens) + tenS;
			centsDue -= 1000 * tens;
		}

		if (centsDue >= 500) {
			int fives = centsDue / 500;
			String fiveS = fives > 1 ? " five dollar bills, " : " five dollar bill, ";
			fiveStr = Integer.toString(fives) + fiveS;
			centsDue -= 500 * fives;
		}

		if (centsDue >= 100) {
			int ones = centsDue / 100;
			String oneS = ones > 1 ? " one dollar bills, " : " one dollar bill, ";
			oneStr = Integer.toString(ones) + oneS;
			centsDue -= 100 * ones;
		}

		if (centsDue >= 25) {
			int quarters = centsDue / 25;
			String qrtS = quarters > 1 ? " quarters, " : " quarter, ";
			qrtStr = Integer.toString(quarters) + qrtS;
			centsDue -= 25 * quarters;
		}

		if (centsDue >= 10) {
			int dimes = centsDue / 10;
			String dimeS = dimes > 1 ? " dimes, " : " dime, ";
			dimeStr = Integer.toString(dimes) + dimeS;
			centsDue -= 10 * dimes;
		}

		if (centsDue >= 5) {
			int nickels = centsDue / 5;
			String nickelS = nickels > 1 ? " nickels, " : " nickel, ";
			nickelStr = Integer.toString(nickels) + nickelS;
			centsDue -= 5 * nickels;
		}
		if (centsDue >= 1) {
			int pennies = centsDue;
			String pennyS = pennies > 1 ? " pennies, " : " penny, ";
			pennyStr = Integer.toString(pennies) + pennyS;
			centsDue -= centsDue - pennies;
		}
		denominations += tensStr + fiveStr + oneStr + qrtStr + dimeStr + nickelStr + pennyStr;
		denominations = denominations.substring(0, denominations.length()-2);
		return denominations + ".";
	}	
}
