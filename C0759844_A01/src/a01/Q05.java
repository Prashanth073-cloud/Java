package a01;

/*****************************************
 * Assignment 01
 * C0759844- Prashanth Chintala
 * Question 05
 * Date of submission: 2020-01-24
 * *************************************/

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		calculateInterest();
	}

	/**
	 * This method will calculate number of months required to pay the loan amount
	 * and also prints the interest amount
	 */

	public static void calculateInterest() {
		float monthlyIntAmount, debtAmount = 0.0f;
		final float INTEREST_PERCENT = (float) (1.5 / 100);
		final int MONTHLY_PAYMENT_AMOUNT = 50;

		Scanner in = new Scanner(System.in); // scanner object
		System.out.println("Enter the amount which you have purchased for: ");
		float purchasedValue = in.nextFloat();

		float remainingAmount = purchasedValue; // copying purchased value into remainingamount variable

		int monthCounter = 0;
		float totalIntPaid = 0;

		// This loop runs until remaining amount is greater than 0
		while (remainingAmount > 0) {
			monthlyIntAmount = INTEREST_PERCENT * remainingAmount; // calculating monthly interest amount
			totalIntPaid = totalIntPaid + monthlyIntAmount; // calculating interest amount
			debtAmount = MONTHLY_PAYMENT_AMOUNT - monthlyIntAmount; // calculating debt amount

			// It will check if the remaining amount is less than or equals 50
			// and if it is,it will keep remainingamount as zero
			if (remainingAmount <= 50)
				remainingAmount = 0;
			else
				remainingAmount = remainingAmount - debtAmount;
			monthCounter++; // month counter

			// System.out.println(remainingAmount);
		}

		System.out.println("The number of months it will take to pay off $" + purchasedValue + " is " + monthCounter);
		System.out.println("The total amount of interest paid is " + totalIntPaid);
		in.close();

	}

}
