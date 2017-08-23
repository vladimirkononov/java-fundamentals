package com.sqa.vk;

import java.util.*;

public class MonthSelector {

	public static void main(String[] args) {
		String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"Octorber", "November", "December" };
		System.out.print("Type the number of the month: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int i = Integer.parseInt(input);
		switch (i) {
		case 1:
			System.out.println(month[0]);
			break;
		case 2:
			System.out.println(month[1]);
			break;
		case 3:
			System.out.println(month[2]);
			break;
		case 4:
			System.out.println(month[3]);
			break;
		case 5:
			System.out.println(month[4]);
			break;
		case 6:
			System.out.println(month[5]);
			break;
		case 7:
			System.out.println(month[6]);
			break;
		case 8:
			System.out.println(month[7]);
			break;
		case 9:
			System.out.println(month[8]);
			break;
		case 10:
			System.out.println(month[9]);
			break;
		case 11:
			System.out.println(month[10]);
			break;
		case 12:
			System.out.println(month[11]);
			break;
		default:
			break;
		}
	}
}
