package getStarted;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which CSC class are you in?");
		String input = keyboard.nextLine();

		System.out.println("Welcome to CSC "+ input);

	}
}
