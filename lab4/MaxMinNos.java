/*
	Scanner
	  i) import java.util.Scanner;			// before everything
	 ii) Scanner keys = new Scanner(System.in);	// in your program before using keys
	iii) Choose from the following Scanner methods:
		int num = keys.nextInt() 		=> reads an int from the user
		double score = keys.nextDouble() 		=> reads a double from the user
		String word = keys.next() 		=> reads a word from the user
		String line = keys.nextLine()		=> reads a whole line of text from the user
*/
package lab4;

import java.util.Scanner;	
public class MaxMinNos{

	public static void main(String []args)	{


// Q1) Set up a Scanner, then let netbeans import the Scanner class for you..
		Scanner sc = new Scanner(System.in);

// Q2) Read in an integer and save it in a variable called num
		int num = sc.nextInt();
		System.out.print("Please enter a number: " + num);
       

// Q3) Make 4 integer variables max, min, total all set to num and count set to 1
		int max = num, min = num, total = num;
		int count = 1;

// Q4) Read in another integer and save it in num
		System.out.print("Please enter a number: ");
        num = sc.nextInt();


// Q5) Update max,min,total and count correctly
        max = Math.max(num, max);
        min = Math.max(num, min);
        total = min + max;
        count++;


// Q6) Read in another integer and save it in num (copy/paste Q4)
		System.out.print("Please enter a number: " );
        num = sc.nextInt();


// Q7) Update max,min,total and count correctly  (copy/paste Q5)
        max = Math.max(num, max);
        min = Math.min(num, min);
        total = max + min;
        count++;


// Q8) Read in another integer and save it in num (copy/paste Q4)
		System.out.print("Please enter a number: ");
        num = sc.nextInt();


// Q9) Update max,min,total and count correctly  (copy/paste Q5)
        max = Math.max(num, max);
        min = Math.min(num, min);
        total = max + min;
        count++;

// Q10) Print out the results
		System.out.println("The largest number is: " + max ) ;
		System.out.println("The smallest number is: " + min ) ;
		System.out.println("The total is: " + total );
		System.out.println("The average is: " + (double)total/count );


	}
}