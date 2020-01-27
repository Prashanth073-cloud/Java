package a01;

/*****************************************
 * Assignment 01
 * C0759844- Prashanth Chintala
 * Question 09
 * Date of submission: 2020-01-24
 * *************************************/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		new Q9().calculateGrade();
	}

	/**
	 * This method calculates students and grades and shows percentage
	 */
	public void calculateGrade() {

		float scoreReceivedForExercise, totalScoreCounter = 0.0f, exerciseScoreCounter = 0.0f;
		int possibleScore = 0;
		int exerciseCounter = 1;

		Scanner in = new Scanner(System.in); // scanner object
		System.out.println("How many exercises to input? ");
		int noOfExercises = in.nextInt();

		while (noOfExercises > 0) {

			System.out.println("Score received for exercise" + exerciseCounter);
			scoreReceivedForExercise = in.nextInt(); // asking user for his/her score
			exerciseScoreCounter = exerciseScoreCounter + scoreReceivedForExercise; // calculating user scores with
																					// previous scores

			System.out.println("Total points possible for exercise" + exerciseCounter);
			possibleScore = in.nextInt(); // asking user for possible score
			totalScoreCounter = totalScoreCounter + possibleScore;// adding all possible scores

			noOfExercises--;
			exerciseCounter++;

		}

		float percentage = (exerciseScoreCounter / totalScoreCounter) * 100; // calculating percentage
		DecimalFormat decimalFormat = new DecimalFormat("0.00"); // creating decimal format object
		System.out.println("Your total is " + exerciseScoreCounter + " out of " + totalScoreCounter + ", or "
				+ decimalFormat.format(percentage) + "%");

		in.close(); // closing scanner object
	}

}
