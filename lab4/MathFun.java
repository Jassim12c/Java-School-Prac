package lab4;

public class MathFun {

/*
  You will need to use:
	Math.E					=> the constant e (Euler's number, 2.718..)
	Math.PI					=> the constant PI (3.14...)
	Math.max( double num1, double num2) 	=> larger of num1 and num2
	Math.min( double num1, double num2)	=> smaller of num1 and num2
	Math.sqrt( double num )			=> square root of the number
	Math.pow(double num, double exponent)	=> raises the num to the exponent
	Math.round( double num )		=> rounds to whole number
	Math.abs( double num )			=> absolute value changes -ves to +ves
*/
		public static void main(String[] args){

			double x = 5.15, y = 5.21;

// Write the Java code for the maths equations in MathFun.jpg.
// Make double variables ans1, ans2 and ans3 for each question and then print them out.

// Q1)
			double ans1 = Math.sqrt((x + Math.pow(y, 5)) / Math.PI);
			System.out.println("Ans1: " + ans1);

// Q2)
			double ans2 = Math.max(Math.pow(Math.E, x), Math.pow(y, 5));
			System.out.println("Ans2: " + ans2);

// Q3)
			double ans3 = Math.abs(Math.sqrt(x) - Math.sqrt(y));
			System.out.println("Ans3: " + ans3);

// Q4) You want to check if x and y are close (within epsilon of each other)
//    Make a boolean variable called close, work it out and finally print it out

			double epsilon = 0.01;

			System.out.println("x and y are within epsilon: " + (Math.abs(y - x) < epsilon));

		}
	}