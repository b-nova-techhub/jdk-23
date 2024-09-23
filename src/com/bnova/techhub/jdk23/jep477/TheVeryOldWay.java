package com.bnova.techhub.jdk23.jep477;

import java.util.List;
import java.util.Scanner;


public class TheVeryOldWay {
	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Banana", "Cherry");
		System.out.println("Fruits: " + fruits);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Your name is: " + name);
		scanner.close();
	}
}
