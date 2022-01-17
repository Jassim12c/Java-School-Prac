import java.awt.*;
import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
/*        System.out.print("Enter the input string: ");
        String str = keys.next();
        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            char letter = str.charAt(i);

            ans += letter;
        }
        System.out.println(ans);*/


/*        int a = keys.nextInt();
        int b = keys.nextInt();

        for(int i=a; i <= b; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }*/

      /*  String msg = "Go Java Go";
        String ans = "";
        int counter = 1;

        for(int i=0; i<=msg.length()-1; i++){
            char letter = msg.charAt(i);
            if(letter != ' '){
                System.out.println(counter + ". " + msg.charAt(i));
                counter++;
            }
        }*/

/*
        int i = 200;
        while( i >= 100){
            System.out.println(i);
            i-=10;
        }
*/

/*        int num1 = keys.nextInt();
        int num2 = keys.nextInt();
        int evenNums = 0;

        for(int i=num1; i<=num2; i++){
            if(i%2==0){
                evenNums += i;
            }
        }
        System.out.println(evenNums);*/

/*        String text = "Hello MY name";
        int count = 0;

        for(int i=0; i<=text.length()-1; i++){
            if(Character.isUpperCase(text.charAt(i))){
                count++;
            }
        }
        System.out.println(count);*/



/*
        for( int i=1; i<=7; i++ ){
            for( int j=1; j<=15; j++ ){

                if( j<=6 || j-i==7 || j+i==15)
                    System.out.print("X");
                else if(j==7){
                    System.out.print("O");
                }
                else
                    System.out.print("O");
            }
            System.out.println();
        }

*/
/*
        for(    int i=1; i<=7; i++        ){
            for(  int j=1; j<=15; j++            ){
                if( j<=6  || i==j-7 ||  i + j ==15    )
                    System.out.print( "X"    );
                else
                    System.out.print( "O"    );
            }
            System.out.println();
        }
*/

        for(    int i=1; i<=7; i++        ){
            for(  int j=1; j<=15; j++            ){
                if( j<=6  || i==j-7 ||  i + j ==15    )
                System.out.print( "X"    );
        else
                System.out.print( "O"    );
            }
            System.out.println();
        }

        System.out.print("Enter number x: ");
        int x = keys.nextInt();
        System.out.print("Enter number n: ");
        int n = keys.nextInt();

        int result = 1;

        for(int i=n; i>0; i--){
            result*=x;
        }
        System.out.println(x + " power " + n + " is " + result);

        System.out.print("Enter number a: ");
        int a = keys.nextInt();
        System.out.print("Enter number b: ");
        int b = keys.nextInt();
        int numOfOdds = 0;

        for(int i=a; i <= b; i++){
            System.out.println(i);
            if(i % 2 != 0){
                numOfOdds++;
            }
        }

        System.out.println("Number of odd values between a and b is: " + numOfOdds);

    }

/*    public static void draw ( int size, char symbol1 , char symbol2) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i%2==1  ){
                    System.out.print(symbol1);
                }else {
                    System.out.print(symbol2);
                }
            }
            System.out.println();
        }
    }*/




}