package a01;

/*****************************************
 * Assignment 01 C0759844- Prashanth Chintala Question 08 Date of submission:
 * 2020-01-24
 *************************************/

public class Q08 {

	public static void main(String[] args) {
		cryptoPuzzle();

	}

	/**
	 * This method checks all possible combinations for the letter 't','o','g'.'d'
	 * and also checks no two letters with same digits(0-9)
	 */
	public static void cryptoPuzzle() {
		int digitsRange = 9; // digits range
		for (int t = 0; t <= digitsRange; t++) { // t loop
			for (int o = 0; o <= digitsRange; o++) { // o loop
				for (int g = 0; g <= digitsRange; g++) { // g loop
					for (int d = 0; d <= digitsRange; d++) { // d loop
						String too = t + "" + o + "" + o; // converting separate letters t,o,o to string
						String good = g + "" + o + "" + o + "" + d; // converting separate letters g,o,o,d to string

						int goodValue = Integer.valueOf(good); // converting good string to integer
						int tooValue = Integer.valueOf(too); // converting too string to integer

						// this loop will whether (too+too+too+too)=good and all the letters have
						// different digits and
						// good having four letter which means it should be greater than 999
						if (4 * tooValue == goodValue && t != o && t != g && t != d && o != g && o != d && g != d
								&& (4 * tooValue) > 999) {
							System.out.println("The value is " + tooValue + "*4 = " + goodValue);
							System.out.println("t = " + t + ", o = " + o + ", g = " + g + ", d = " + d);
						}

					}
				}
			}
		}
	}

}
