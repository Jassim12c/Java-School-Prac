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
*/

/*
	Write a program that does the following:
		  i) Reads in 2 doubles, the height and width of a rectangle
		 ii) Work out and print the area and the perimeter of the rectangle
		iii) Work out and prints the length of the diagonal (use Pythagoras)
*/

import java.util.Scanner;

public class Rectangle {

	public static void main(String []args)	{

	    Scanner sc = new Scanner(System.in);
	    double width = sc.nextDouble();
	    double height = sc.nextDouble();
		System.out.print("Please enter the width and height of the rectangle: ");




		System.out.println("Area: " + (width * height) );
		System.out.println("Perimeter: " + (2*(width+height)) );
		System.out.println("Diagonal: " + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));

	}
}