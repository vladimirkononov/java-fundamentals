package com.sqa.vk;

import java.util.*;

import com.sqa.vk.helpers.*;

public class MonthSimple {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		monthSelection();
	}

	private static void monthSelection() {
		// System.out.print("Enter a number from 1 - 12 ");
		// int num = 0;
		// String input = scanner.nextLine();
		// num = Integer.parseInt(input);
		int num = AppBasics.requestInt("Enter a number from 1 - 12");
		switch (num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		}
	}
}
