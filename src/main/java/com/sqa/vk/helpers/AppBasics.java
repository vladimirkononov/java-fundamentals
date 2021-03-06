/**
 * File Name: AppBasics.java<br>
 * Kononov, Vladimir<br>
 * Created: Aug 19, 2017
 */
package com.sqa.vk.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Kononov, Vladimir
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	private static String userName;

	public static void farewellUser() {
		System.out.println("\nThank you, " + userName + " for using our application.");
		System.out.println("Have a nice day!");
	}

	public static String greetUserAndGetName(String appName) {
		// Greet the user using a system out call
		System.out.println("Hello there! Wellcome to the " + appName + " Application");
		// Ask the user for their name and store in a local scope String
		// variable
		// String userName = null;
		System.out.print("Can i get your name? ");
		userName = scanner.nextLine();
		return userName;
	}

	public static boolean requestBoolean(String question) {
		String input;
		System.out.println(question + " ");
		input = scanner.nextLine();
		if (input.trim().equalsIgnoreCase("Yes")) {
			return true;
		} else if (input.trim().equalsIgnoreCase("No")) {
			return false;
		} else {
			System.out.println("You didn't respond to the question. Please enter \"Yes\" or \"No\"");
			return false;
		}
	}

	public static char requestChar(String question) {
		char letter = 0;
		System.out.println(question + " ");
		try {
			letter = scanner.nextLine().charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("You did not supply a valid input [" + letter + "]. please provide a single letter.");
		}
		return letter;
	}

	public static double requestDouble(String question) {
		double num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static float requestFloat(String question) {
		float num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Float.parseFloat(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static int requestInt(String question) {
		int num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
		}
		return num;
	}

	public static long requestLong(String question) {
		String input;
		long num = 0;
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			num = Long.parseLong(input);
		} catch (NumberFormatException e) {
			System.out.println("You didn't provide expected input [" + input + "]. Please enter Long number.");
		}
		return num;
	}

	public static short requestShort(String question) {
		String input;
		short num = 0;
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			num = Short.parseShort(input);
		} catch (NumberFormatException e) {
			System.out.println("You didn't provide expected input [" + input + "]. Please enter Short number.");
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
