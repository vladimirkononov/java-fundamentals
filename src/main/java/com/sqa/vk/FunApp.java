package com.sqa.vk;

import java.util.*;

import com.sqa.vk.helpers.*;

public class FunApp extends AppBasics {

	private static String nameOfApp = "Funner";

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		greetUserAndGetName(nameOfApp);
		requestFloat("Enter a Float number ");
		requestLong("Enter a Long number ");
		requestShort("Enter a Short number ");
		requestBoolean("Yes/No");
		requestChar("Type the letter: ");
		farewellUser();
	}
}