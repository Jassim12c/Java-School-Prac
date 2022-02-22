package lab4;
/*
	Scanner
	i) import java.util.Scanner;			// before everything
	ii) Scanner keys = new Scanner(System.in);	// in your program before using keys
	iii) Choose from the following Scanner methods:
		int num = keys.nextInt() 		=> reads an int from the user
		double score = keys.nextDouble() 	=> reads a double from the user
		String word = keys.next() 		=> reads a word from the user
		String line = keys.nextLine()		=> reads a whole line of text from the user


	String methods:  length() and compareTo( otherString )
	Note: "ant".compareTo("cat") < 0 => true (because ant comes before cat alphabetically)

	Math methods:	Math.max( num1, num2 ) and Math.min( num1, num2)
*/

/*
	Write a program that does the following:
		  i) Reads in 3 words from the user
		 ii) Print out if the words are in order: true or false
		     Words are in order if they are alphabetically increasing, or decreasing.
		iii) Print out the length of the longest word.
*/

import java.util.Scanner;

public class WordFun {

	public static void main(String []args)	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter three words: ");

		String words = sc.nextLine();
		int get_space = words.indexOf(" ");
		String get_first_word = words.substring(0, get_space);
		int get_second_space = words.indexOf(" ", get_space+1);
		String get_second_word = words.substring(get_space+1, get_second_space);
		String get_third_word = words.substring(get_second_space+1);


		boolean result = (get_first_word.compareTo(get_second_word) < get_second_word.compareTo(get_first_word) && get_second_word.compareTo(get_third_word) < get_third_word.compareTo(get_second_word)) || (get_first_word.compareTo(get_second_word) > get_second_word.compareTo(get_first_word) && get_second_word.compareTo(get_third_word) > get_third_word.compareTo(get_second_word));

		int first_sec = Math.max(get_first_word.length(), get_second_word.length());
		int third = Math.max(first_sec, get_third_word.length());
		System.out.println("Your words are ordered: " + result );
		System.out.println("longest word: " + third);

	}
}