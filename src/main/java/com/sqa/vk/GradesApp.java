package com.sqa.vk;

import java.util.*;

public class GradesApp {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		checkGradeValue();
	}

	/**
	 *
	 */
	private static void checkGradeValue() {
		int value = 0;
		System.out.println("Print your grade value ");
		String input = scanner.nextLine();
		value = Integer.parseInt(input);
		if (value >= 800) {
			System.out.print(" You've got \"A\". Excellent!");
		} else if (value >= 700) {
			System.out.print(" You've got \"B\". Good Job!");
		} else if (value >= 500) {
			System.out.println("Your grade is \"C\". Need more study...");
		} else {
			System.out.println("You've got \"D\". Shame on you!");
		}
	}
}
