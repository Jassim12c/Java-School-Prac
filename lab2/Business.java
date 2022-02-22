package lab2;

public class Business {

	public static void main(String []args)	{

// 1) Make a constant of type double called TARGET and set it to 15000
	final double target = 15000;

// 2) Make 4 double variables called aliMoney initialized to 4500, aliSalary initialized to 600
//    fayMoney initialized to 4200 and fayExpenses initialized to 150
// Note: aliSalary and fayExpenses are both monthly		
	double aliMoney = 4500;
	double aliSalary = 600; // Monthly
	double fayMoney = 4200;
	double fayExpenses = 150; // Monthly


// 3) Ali works for one year (12 months) and he saved only 35% of his salary. Update aliMoney correctly.
    aliMoney += (aliSalary * 12) * 0.35;
    

//4) Fay has expenses to pay every month of the year (12 months). Update fayMoney.
	fayMoney = (fayMoney - (fayExpenses * 12));


// 5) Together, can they start the business after one year? i.e. Together, do they have more money than the TARGET?
//  Note: 1000>=900 will be true (a boolean)     500>600 is false
//   Print out=>  Can Ali and Fay start their business: ??	(put the result either true or false in place of the ??)
		System.out.println("Can Ali and Fay start their business: " + (fayMoney + aliMoney >= target));


	}

}