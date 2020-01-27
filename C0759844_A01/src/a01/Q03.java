package a01;

/*****************************************
 * Assignment 01
 * C0759844- Prashanth Chintala
 * Question 03
 * Date of submission: 2020-01-24
 * *************************************/

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		heightOfaChild();
	}

	public static void heightOfaChild() {

		Scanner scanner = new Scanner(System.in); // Creating scanner object to take input from the user
		System.out.println("Enter the gender of the child. Enter(M) for male (F) for Female");
		String userChoice = scanner.nextLine(); // getting user choice from the user

		// This condition checks if the user enter m
		if (userChoice.equalsIgnoreCase("m")) {
			System.out.println("Enter the height of the mother in inches");
			Float motherHeight = scanner.nextFloat();
			System.out.println("Enter the height of the father in inches");
			Float fatherHeight = scanner.nextFloat();

			// formula for calculating male child height
			int maleChildHeight = (int) ((motherHeight * 13 / 12 + fatherHeight) / 2);

			System.out.println("Height of a child is " + maleChildHeight + " inches");

			System.out.println("Press (A) for enter the values again or (E) to exit");
			scanner.nextLine();
			userChoice = scanner.nextLine();

			if (userChoice.equalsIgnoreCase("A")) // This condition check if user wanted to enter the values again
				heightOfaChild(); // calling the same method again
			else
				System.out.println("Thanks for using our application");
		}
		// This condition checks if the user enter f
		else if (userChoice.equalsIgnoreCase("f")) {
			System.out.println("Enter the height of the mother in inches");
			Float motherHeight = scanner.nextFloat();
			System.out.println("Enter the height of the father in inches");
			Float fatherHeight = scanner.nextFloat();

			// calcualting female child height
			int femaleChildHeight = (int) ((motherHeight * 12 / 13 + fatherHeight) / 2);

			System.out.println("Height of a child is " + femaleChildHeight + " inches");
			System.out.println("Press (A) for enter the values again or (E) to exit");
			scanner.nextLine();
			userChoice = scanner.nextLine();

			if (userChoice.equalsIgnoreCase("A"))
				heightOfaChild();
			else
				System.out.println("Thanks for using our application");

		}

		scanner.close();

	}

}
