import java.util.Arrays;

public class SortIt {

// Q1) Make a method called swap that returns nothing and has
// one paramteter of type array of int called nos
// one parameter of type int called pos1
// one paramter of type int called pos2
// swap the 2 elements
public static int[] swap(int[] nos, int pos1, int pos2){
    int temp = nos[pos1];
    nos[pos1] = nos[pos2];
    nos[pos2] = temp;
    return nos;
}

// Q2) Make a method called max that returns an int and has
// one parameter of type array of int called nos
// one parameter of type int called start
// return the position of the largest element from start to the end

    public static int max(int[] nos, int start){
        int max = nos[start];
        int pos = start;
        for(int i=start; i<nos.length; i++){
            if(max<nos[i]){
                max = nos[i];
                pos = i;
            }
        }
        return pos;
    }


// Q3) Make a method called sort that returns nothing and has
// one parameter of type array of int called nos
// use your methods to sort the array
    public static int[] sort(int[] nos){
        for(int i=0; i<nos.length; i++){
            int pos = max(nos, i);
            swap(nos, pos, i);
        }
        return nos;
    }


    public static void main(String[] args) {

            System.out.println(Arrays.toString(swap(new int[]{2, 3, 5, 10}, 0, 1)));
            System.out.println(Arrays.toString(sort(new int[]{3, 9, 6, 7, 2, 5})));

            int[] jassim = {1, 5, 6, 10};
            System.out.println(max(jassim, 0));
/*
 Make a program that starts by asking the user how many numbers he
 will type.
 Next, create an array of int called data of that size
 Next, read that many numbers from the user and fill up the array
 Next, sort the array
 Next, print out the array using an enhanced for loop
*/



	}

}
