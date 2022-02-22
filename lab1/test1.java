package lab1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = {7, 5, 10, 13, 2, 4, 0, 1, 15, 8};
        System.out.println(num.length);
        System.out.println(num[0]);
        System.out.println(num[num.length - 1]);
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(num[i]);
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        for (int i = 5; i <= 8; i++) {
            System.out.println(num[i] = 0);
        }

        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(num[i] = num[i] * 2);
        }
        System.out.println(Arrays.toString(num));

        int sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            sum += num[i];
        }

        System.out.println(sum);
        System.out.println(sum / num.length);

        int bigNum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            if (bigNum < num[i]) {
                bigNum = num[i];
            }
        }
        System.out.println(bigNum);

        int oddNumsSum = 0;
        int evenNumsSum = 0;
        int numOfOdd = 0;
        int numOfEven = 0;

        for (int i = 0; i <= num.length - 1; i++) {
            if (i % 2 == 0) {
                evenNumsSum += num[i];
                numOfOdd++;
            } else {
                oddNumsSum += num[i];
                numOfEven++;
            }
        }

        Arrays.sort(num);
        System.out.print(Arrays.toString(num));

        System.out.println();

        // Q1
        int[][] numbers = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 0; j <= numbers[i].length - 1; j++) {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }

        // Q2
        System.out.println("Provide Number of rows ");
        int rows = sc.nextInt(); // a
        System.out.println("Provide Number of columns");
        int cols = sc.nextInt(); // a
        int[][] array = new int[rows][cols]; // b
        for (int i = 0; i <= array.length - 1; i++) { // c
            for (int j = 0; j <= array[i].length - 1; j++) {
                array[i][j] = sc.nextInt();
            }

        }

        System.out.println(Arrays.deepToString(array)); // d

        System.out.println("Provide a row number to print ");
        int printRow = sc.nextInt();
        System.out.println(Arrays.toString(array[printRow-1])); // e

        System.out.println("Provide a column number to print ");
        int printCol = sc.nextInt();
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i][printCol-1]); // f
        }

        // g
        int rowSum = 0;
        System.out.println("Provide the row number that you want to calculate");
        int calcInt = sc.nextInt()-1;
        for (int i = 0; i <= array.length - 1; i++) {
            rowSum += array[calcInt][i];
        }
        System.out.println(rowSum);

        // h
        int colSum = 0;
        System.out.println("Provide the column number that you want to calculate");
        int colmInt = sc.nextInt();
        for (int i = 0; i <= array.length - 1; i++) {
            colSum += array[i][colmInt-1];
        }
        System.out.println(colSum);

        // i
        int arraySum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                arraySum += array[i][j];
            }
        }

        // Q3

        // A
        int[][] givenArray = {{15, 9, 10, 41}, {22, 13, 63, 50}, {85, 27, 3, 15}, {19, 75, 11, 5}};
        // B
        int total = 0;
        int compareTotal = 0;
        for(int i=0; i <= givenArray.length-1; i++){
            for(int j=0; j <= givenArray[i].length-1; j++){
                compareTotal += givenArray[i][j];
                if(total < compareTotal){
                    total = compareTotal;
                    compareTotal = 0;
                }
            }
        }
        System.out.println("total of list: " + total);


        // C
        int count = 0;
        int sumOfEven = 0;
        for(int i=0; i<=givenArray.length-1; i++){
            for(int j=0; j<=givenArray.length-1; j++){
                if(givenArray[i][j] > 10 && givenArray[i][j] < 50){
                    count++;
                }
                if(i%2==0 && j%2==0){
                    sumOfEven += givenArray[i][j];
                }
            }
        }
        System.out.println("Between 10 and 50 " + count);
        System.out.println("Sum of even index position numbers " + sumOfEven);


        for(int i=givenArray.length-1; i>=0; i--){
            ;
        }

    }
}