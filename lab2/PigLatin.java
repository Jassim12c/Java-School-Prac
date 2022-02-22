package lab2;

import java.util.Locale;

public class PigLatin {

	public static void main(String []args)	{
                   
	/*
		Pig Latin is a way to speak a secret language that involves scrambling
		letters according to some rules

		Rules:
 		 1. take the first letter
		 2. make it lowercase
		 3. put it at the end of the word
		 4. add the letter "ay" after that

		So,
		 Love => ovelay   
		 Happy => appyhay
		 Good => oodgay
		 Morning => orningmay

		You can make new variables if you want.
	*/
	
		String original = "Java";
		String first_letter = original.substring(0,1).toLowerCase();
		String rest_of_word = original.substring(1);

		System.out.println( rest_of_word + first_letter+ "ay");

	}

}