import java.util.Random;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();

        // Q1

        System.out.println("Enter an integer to print its multiplication table: ");
        int num = sc.nextInt();
        if(num>0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "*" + i + " = " + num * i);
            }
        }

        // Q2

        int lucky = gen.nextInt(19) + 1;
        int attempts = 0;
        System.out.println("Guess the lucky numbers (1-20)");
        // put variables here
        while (true) {

            int guess = sc.nextInt();
            attempts++;

            if ( guess == lucky ) {
                System.out.println("Righ Guess!");
                break;
            }else if(attempts==5){
                System.out.println("You have used all your attempts");
                break;
            }

            if( guess > lucky )
                System.out.println("Too high");
            else
                System.out.println("Too low");
    }

        //Q3

        System.out.println("Enter array num: ");
        int sizeArray = sc.nextInt();
        int[] array = new int[sizeArray];
        System.out.println("Enter elements for the array: ");
        for(int i=0; i<=array.length-1; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(searchArray(array, 5));
        System.out.println(findSum(array));
        System.out.println(findAverage(array));

    }

    // A
    public static boolean searchArray(int[] arr, int num){
        for(int i=0; i<=arr.length-1; i++){
            if(num==arr[i]){
                return true;
            }
        }
        return false;
    }

    // B
    public static int findSum(int[] arr){
        int sum = 0;
        for(int i=0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        return sum;
    }

    // C
    public static int findAverage(int[] arr){
        return findSum(arr) / arr.length;
    }


}
