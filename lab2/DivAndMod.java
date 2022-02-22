package lab2;

public class DivAndMod {

/*
   Ali wants to know how many guests he can invite to his party.

   Every guest must have 1 BIG_MAC and one FRIES

   With the left over money ali wants to buy as many apple pies as you can.

   Finally you must work out the remaining money.

*/

	public static void main(String[] args){

// Here are the constants you should use in this program. Note: All the constants are in fils.
		final int MONEY = 36390;
		final int BIG_MAC = 1100;
		final int FRIES = 250;
		final int APPLE_PIE = 150;


// 1) Print out I have 36KD and 390fils (make some variables and use / and % to work out the values)


		System.out.printf("I have %sKD and %sfils",  (MONEY /  1000), (MONEY % 1000));

// 2) make an int variable called guests and set it equal to the maximum number
//    of guests he can invite. (each guest must be given a BIG_MAC and a FRIES)

     int guests = MONEY / (BIG_MAC + FRIES);


// 3) print out guests in the space in the middle of the sentence
		System.out.println("\nI can invite "+guests+" guests");


// 4) make an int variable called left and set it equal to the remaining money
	int left = MONEY % (guests * (BIG_MAC + FRIES));



// 5) make an int variable called nAP and set it equal to the
//    maximum number of apple pies he can buy
	int nAP = left / APPLE_PIE;
              

// 6) print out nAP in the space in the middle of the sentence
		System.out.println("And buy "+nAP+" Apple Pies");


// 7) recalculate the value of the variable left
	left = left - (nAP * APPLE_PIE);

// 8) print out variable left in the space in the middle of the sentence
		System.out.println("And I will have "+left+" fils left over");



	}
}