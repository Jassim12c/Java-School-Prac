import java.util.Arrays;
import java.util.Scanner;

public class VowelCalc {


    public static void main(String[] args) {

        int[] arr1 = new int[7];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter " + arr1.length + " numbers: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("The original array is: " + Arrays.toString(arr1));
        PairSwap(arr1);
        System.out.println("The swapped array is " + Arrays.toString(arr1));
    }

    public static void PairSwap(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
    }
}