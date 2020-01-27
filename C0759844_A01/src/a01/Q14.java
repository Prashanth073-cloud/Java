package a01;

/*****************************************
 * Assignment 01
 * C0759844- Prashanth Chintala
 * Question 14
 * Date of submission: 2020-01-24
 * *************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		findConsecutiveVowels();
	}

	/**
	 * This method will search for the biggest consecutive vowels in a file
	 */
	public static void findConsecutiveVowels() {
		int previousVowelCount = 0;
		Scanner in = null;

		try {
			File file = new File("words"); // opening a file
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		int wordsCount = 0;
		int firstVowelCount = 0;
		String savedWord = "";
		while (in != null && in.hasNextLine()) {
			int vowelCount = 0, notVowels = 0;

			String currentWord = in.nextLine().toLowerCase(); // current word

			// saving word,initially first word
			if (wordsCount == 0)
				savedWord = currentWord;

			for (int character = 0; character < currentWord.length(); character++) {
				if (currentWord.charAt(character) == 'a' || currentWord.charAt(character) == 'e'
						|| currentWord.charAt(character) == 'i' || currentWord.charAt(character) == 'o'
						|| currentWord.charAt(character) == 'u') {
					vowelCount++; // counting consecutive vowels

				} else {
					if (notVowels == 0) {
						firstVowelCount = vowelCount; // saving previous vowel count of same word
					} else {
						// If the word has two different consecutive vowels then it will take the
						// biggest vowelcount
						if (vowelCount > firstVowelCount)
							firstVowelCount = vowelCount;
						vowelCount = 0;
					}
					notVowels++;
				}
			}

			// this condition will check the previous vowel count with current vowel count
			// and takes greatest count
			if (wordsCount == 0 && vowelCount > firstVowelCount) {
				savedWord = currentWord; // saving word
				previousVowelCount = vowelCount;
			} else if (wordsCount == 0 && firstVowelCount > vowelCount) {
				savedWord = currentWord;
				if (firstVowelCount > previousVowelCount)
					previousVowelCount = firstVowelCount;
			}

			if (wordsCount > 0 && vowelCount > firstVowelCount) {

				if (vowelCount > previousVowelCount) {
					savedWord = currentWord; // saving word
					previousVowelCount = vowelCount;
				}

			} else if (wordsCount > 0 && firstVowelCount > vowelCount) {

				if (firstVowelCount > previousVowelCount) {
					savedWord = currentWord;
					previousVowelCount = firstVowelCount;
				}

			}

			wordsCount++;

		}

		System.out.println("The word which has consecutive vowel " + savedWord);
		in.close();

	}

}
