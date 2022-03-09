package lab1;

import java.util.Scanner;

public class lab1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[][] grades = {{77.0, 84.0, 70.0}, {79.0, 82.0, 94.0}, {100.0, 91.0, 96.0}};
        String[] name = {"Ali", "Dana", "Ahmad"};

        System.out.print("Names Test1 Test2 Test3 Average\n");
        double sumCalc=0;
        int numCount = 0;
        for(int i=0; i<=name.length-1; i++) {
            System.out.print(name[i]);
            for (int j = 0; j <= grades[i].length - 1; j++) {
                System.out.printf(" %.2f ", grades[i][j]);
                sumCalc += grades[i][j];
                numCount++;
            }
            System.out.printf("%.2f", sumCalc / numCount);
            sumCalc = 0;
            numCount = 0;
            System.out.println();
        }
        System.out.println();
        printArray();


        System.out.println("Enter number of rows\n>");
        int rowMat = sc.nextInt();
        System.out.println("Enter number of columns\n> ");
        int columnMat = sc.nextInt();
        int[][] matrixArr = new int[rowMat][columnMat];

        System.out.println("Enter elements of Matrix: ");
        for(int i=0; i<=matrixArr.length-1; i++){
            for(int j=0; j<=matrixArr[i].length-1; j++){
                matrixArr[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        // Q3

        System.out.println(findMax(matrixArr));
        System.out.println(findMin(matrixArr));

    }

    public static void printArr(int[][]tickets){

        for(int i=0; i<=tickets.length-1; i++){
            for(int j=0; j<=tickets[i].length-1; j++){
                System.out.print(tickets[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(){
        Scanner sc = new Scanner(System.in);
        int[][] tickets = {{10, 10, 20, 20},
                {10, 10, 20, 20},
                {20, 20, 30, 30},
                {20, 30, 30, 40}
        };

        System.out.println("Welcome to the theater booking system!");

        int count = 1;

        while (count <= 3) {
            printArr(tickets);
            System.out.println("Ticket number - " + count);
            System.out.println("Please enter row number of the seat you want to select:");
            int row = sc.nextInt();
            System.out.println("Please enter column number of the seat you want to select:");
            int column = sc.nextInt();
            sellSeatByNumber(tickets, row, column);
            count++;
        }
        printArr(tickets);
    }

    public static void sellSeatByNumber(int[][] tickets, int sellRow, int sellColumn){
        if(tickets[sellRow][sellColumn] == 0){
            System.out.println("Seat not available");
        }else{
            tickets[sellRow][sellColumn] = 0;
        }
    }

    public static int findMax(int[][] lst){
        int maxNum = 0;
        for(int i=0; i<=lst.length-1; i++){
            for(int j=0; j<=lst[i].length-1; j++){
                if(maxNum < lst[i][j]){
                    maxNum = lst[i][j];
                }
            }
            System.out.printf("Maximum element in row-%d\n", maxNum);
            maxNum = 0;
        }
        return maxNum;
    }

    public static int findMin(int[][] lst){
        int minNum = lst[0][0];
        for(int i=0; i<=lst.length-1; i++){
            for(int j=0; j<=lst[i].length-1; j++){
                if(minNum > lst[i][j]){
                    minNum = lst[i][j];
                }
            }
            System.out.printf("Min element in row-%d\n", minNum);
            minNum = lst[i][0];
        }
        return minNum;
    }
}