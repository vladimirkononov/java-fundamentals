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

	public static void farewellUser(String userName) {
		System.out.println("Thank you, " + userName + " for using our application.");
		System.out.println("Have a nice day!");
	}

	public static String greetUserAndGetName(String appName) {
		// Greet the user using a system out call
		System.out.println("Hello there! Wellcome to the " + appName + " Application");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.print("Can i get your name? ");
		return scanner.nextLine();
	}

	public static boolean requestBolean(String question) {
		boolean answer = true;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			answer = Boolean.getBoolean(question);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			// System.exit(0);
		}
		return answer;
	}

	public static boolean requestChar(String question) {
		boolean letter = true;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		letter = Character.isJavaIdentifierPart(0);
		if (letter != true) {
			System.out.println("You didn't enter a single character. Try again. ");
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
			System.exit(0);
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
			System.exit(0);
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
			System.exit(0);
		}
		return num;
	}

	public static long requestLong(String question) {
		long num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Long.parseLong(question);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			System.exit(0);
		}
		return num;
	}

	public static short requestShort(String question) {
		short num = 0;
		String input;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			num = Short.parseShort(question);
		} catch (NumberFormatException e) {
			System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			System.exit(0);
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
