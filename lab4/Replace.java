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


	String methods:  substring , indexOf
*/

/*
	Write a program that does the following:
		  i) Reads in a line and two words (first and second)
		 ii) Replace the first word (assume it is there) in line with
			 the second word

	e.g. If the user types "I hate Java" and "hate" and "love"
		Then you print out=>  The changed line: I love Java

*/

import java.util.Scanner;

public class Replace {

	public static void main(String []args)	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a line of text: ");
		String line_text = sc.nextLine();


		System.out.print("Please enter two words: ");
		String words = sc.nextLine();

		int get_space = words.indexOf(" ");
		String second_word = words.substring(get_space+1);

		int get_space_line = line_text.indexOf(" ");
		String line_sentence = line_text.substring(get_space_line);

		String new_sen = second_word + line_sentence;



		System.out.println("The changed line: " + new_sen );

	}
}