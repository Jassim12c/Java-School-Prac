package lab2;

import java.util.Locale;

public class StringFun2 {

	public static void main(String[] args){

		String s1 = "  To Be Or Not To Be That Is To Be The Question    ";

                String s2 = "The time has come the walrus said to talk of many things";


// 1/ Use the trim method to change s1 so that it removes the spaces from the start and end
		s1 = s1.trim();

// 2/ print out s1 at the end
		System.out.println("String s1 is => " + s1 );


// 3/ print out s2 at the end
		System.out.println("String s2 is => " + s2);


// 4/ use the length method to print out the lengths of s1 & s2
//   in the underlines below

		System.out.println("String s1 is "+s1.length()+" characters long");
		System.out.println("String s2 is "+s2.length()+" characters long");

// 5/ use the toLowerCase and toUpperCase below to print out s1 in lower and upper:

		System.out.println("String s1 in lowercase is => " + s1.toLowerCase() );
		System.out.println("String s1 in uppercase is => " + s1.toUpperCase());


// 6/ use the substring method to change s1 so that you drop the first 3 letters..

		System.out.println("After dropping the first 3 letters s1 became => " + s1.substring(4) ) ;


// 7/ use the substring method to print out the word time (count its position) in s2 in capitals => TIME

		System.out.println(s2.substring(4,8).toUpperCase());


// 8/ Print out the position of the word walrus in s2
		System.out.println("The word walrus is at position => " + s2.indexOf("walrus") );


// 9/  - Print out the last letter of s2:
//     - Hint: make a variable called len and save the length of s2, then use charAt method

		int last_letter_index = s2.length();
		String last_letter = s2.substring(last_letter_index - 1);
		System.out.println("The last letter of string s2 is => " + last_letter);


// 10/ use the indexOf method and the substring method to print out the first word of s1

 		int get_index = s1.indexOf(" ");
		String get_first_word = s1.substring(0, get_index);
		System.out.println(get_first_word);

	}
}