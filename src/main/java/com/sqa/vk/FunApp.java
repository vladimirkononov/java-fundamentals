package com.sqa.vk;

import java.util.*;

import com.sqa.vk.helpers.*;

public class FunApp {

	private static String nameOfApp = "Funner";

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AppBasics.greetUserAndGetName(nameOfApp);
		AppBasics.requestFloat("Enter a Float number ");
		AppBasics.requestLong("Enter a Long number ");
		AppBasics.requestShort("Enter a Short number ");
		AppBasics.requestBoolean("Yes/No");
		AppBasics.requestChar("Type the letter: ");
		// AppBasics.farewellUser(userName);
	}
}